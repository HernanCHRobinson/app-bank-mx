package ar.com.viewpaymentsb.auth.repositories;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.viewpaymentsb.auth.entities.User;

public interface IUserRepository extends JpaRepository<User, BigInteger> {

	Optional<User> findByUsername(String mail);

}