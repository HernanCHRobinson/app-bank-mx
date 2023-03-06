package ar.com.viewpaymentsb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RolUser {
	administrator("ROLE_ADMIN", "Administrador"), guest("ROLE_USER", "Usuario");

	private final String rol;
	private final String description;
}