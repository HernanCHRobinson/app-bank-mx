package ar.com.viewpaymentsb.auth.controllers;

import java.math.BigInteger;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ar.com.viewpaymentsb.auth.entities.User;
import ar.com.viewpaymentsb.auth.services.UserService;
import ar.com.viewpaymentsb.exceptions.DeveloperException;

@RestController()
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) throws DeveloperException {
		Optional<User> userDB = userService.findByUsername(user.getUsername());
		if (userDB.isPresent()) {
			throw new ResponseStatusException(HttpStatus.FOUND, "Ya existe un usuario con ese mail.");
		}
		user.setId(BigInteger.valueOf(2));
		user.setActive(true);
		user.setRegistrationDate(new Date(System.currentTimeMillis()));
		user.setSystemType((short) 1);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
}
