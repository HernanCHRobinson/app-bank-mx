package ar.com.viewpaymentsb.auth.services;

import ar.com.viewpaymentsb.auth.entities.Roles;

public class RolService {

	public Roles getRol(Integer idRol) {
		return Roles.builder().id(idRol).name("ADMIN").build();
	}
}
