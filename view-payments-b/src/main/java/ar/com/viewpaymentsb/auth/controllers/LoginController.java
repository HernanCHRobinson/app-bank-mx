package ar.com.viewpaymentsb.auth.controllers;

import static ar.com.viewpaymentsb.auth.SecurityConstants.HEADER_STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.viewpaymentsb.auth.services.UserDetailsServiceImpl;

@RestController()
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserDetailsServiceImpl userService;

	@GetMapping(path = "/whoami")
	public ResponseEntity<UserDetails> whoAmI(
			@RequestHeader(value = "authorization", required = false) String authorization) {
		System.out.printf("authorization: %s \n", authorization);
		if (authorization == null || (authorization != null && authorization.trim().isEmpty())) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}

		UserDetails userDetails = userService
				.loadUserByUsername((String) SecurityContextHolder.getContext().getAuthentication().getPrincipal());

		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set(HEADER_STRING, authorization);

		return ResponseEntity.ok().headers(responseHeaders).body(userDetails);
	}
}