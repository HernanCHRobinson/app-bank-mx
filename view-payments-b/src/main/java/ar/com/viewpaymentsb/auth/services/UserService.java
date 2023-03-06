package ar.com.viewpaymentsb.auth.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import ar.com.viewpaymentsb.auth.entities.User;
import ar.com.viewpaymentsb.auth.repositories.IUserRepository;
import ar.com.viewpaymentsb.enums.ErrorUser;
import ar.com.viewpaymentsb.exceptions.DeveloperException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
	private final IUserRepository userRepository;


	public User userLoggedIn() throws DeveloperException {
		String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = findByUsername(username).get();
		return user;
	}


	public User save(User user) throws DeveloperException {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			DeveloperException developerException = new DeveloperException(e, ErrorUser.USER_SAVE.getCode(),
					ErrorUser.USER_SAVE.getMessageFull());
			throw developerException;
		}
	}

	public Optional<User> findByUsername(String username) throws DeveloperException {
		try {
			return userRepository.findByUsername(username);
		} catch (Exception e) {
			DeveloperException developerException = new DeveloperException(e, ErrorUser.USER_FIND.getCode(),
					ErrorUser.USER_FIND.getMessageFull());
			throw developerException;
		}
	}


}