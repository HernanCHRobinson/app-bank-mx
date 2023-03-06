package ar.com.viewpaymentsb.auth;

import static ar.com.viewpaymentsb.auth.SecurityConstants.EXPIRATION_TIME;
import static ar.com.viewpaymentsb.auth.SecurityConstants.HEADER_STRING;
import static ar.com.viewpaymentsb.auth.SecurityConstants.SECRET;
import static ar.com.viewpaymentsb.auth.SecurityConstants.TOKEN_PREFIX;
import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.server.ResponseStatusException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	private AuthenticationManager authenticationManager;
	private UserDetailsService userService;
	private UserDetails user;

	public JWTAuthenticationFilter(AuthenticationManager authenticationManager, UserDetailsService userService) {
		this.authenticationManager = authenticationManager;
		this.userService = userService;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException {
		try {
			ar.com.viewpaymentsb.auth.entities.User creds = new ObjectMapper().readValue(req.getInputStream(),
					ar.com.viewpaymentsb.auth.entities.User.class);

			this.user = userService.loadUserByUsername(creds.getUsername());

			return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creds.getUsername(),
					creds.getPassword(), this.user.getAuthorities()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
			Authentication auth) throws IOException, ServletException {

		try {
			String token = JWT.create().withSubject(((User) auth.getPrincipal()).getUsername())
					.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
					.sign(HMAC512(SECRET.getBytes()));
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(this.user);
			PrintWriter out = res.getWriter();
			res.setContentType("application/json");
			res.setCharacterEncoding("UTF-8");
			res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
			out.print(json);
			out.flush();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getLocalizedMessage());
		} catch (JWTCreationException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getLocalizedMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getLocalizedMessage());
		}
	}

	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException failed) throws IOException, ServletException {
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
				failed.getCause().getCause().getCause().getLocalizedMessage());
		// response.sendError(HttpServletResponse.SC_EXPECTATION_FAILED,
		// failed.getCause().getCause().getCause().getLocalizedMessage());
	}
}
