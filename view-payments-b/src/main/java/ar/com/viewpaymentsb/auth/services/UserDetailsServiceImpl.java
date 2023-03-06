package ar.com.viewpaymentsb.auth.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.com.viewpaymentsb.auth.repositories.IUserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private IUserRepository applicationUserRepository;
	private RolService rolService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("UserDetailsServiceImpl - loadUserByUsername");
		Optional<ar.com.viewpaymentsb.auth.entities.User> applicationUser = applicationUserRepository
				.findByUsername(username);
		if (applicationUser == null) {
			throw new UsernameNotFoundException(username);
		}
		Set<SimpleGrantedAuthority> setAuthorities;
		if (applicationUser.get().getSystemType().equals((short) 1)) {
			setAuthorities = new HashSet<SimpleGrantedAuthority>(Arrays.asList(
					new SimpleGrantedAuthority("ROLE_USUARIO"), new SimpleGrantedAuthority("ROLE_BACKOFFICE"),
					new SimpleGrantedAuthority("ROLE_COMPRADOR"), new SimpleGrantedAuthority("ROLE_VENDEDOR")));
		} else {
			setAuthorities = new HashSet<SimpleGrantedAuthority>(
					Arrays.asList(new SimpleGrantedAuthority("ROLE_USUARIO"), new SimpleGrantedAuthority(
							"ROLE_" + rolService.getRol(applicationUser.get().getId().intValue()).getName())));
		}
		return new User(applicationUser.get().getUsername(), applicationUser.get().getPassword(), setAuthorities);
	}
}