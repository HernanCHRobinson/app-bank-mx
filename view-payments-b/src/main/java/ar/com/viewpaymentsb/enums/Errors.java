package ar.com.viewpaymentsb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*** @author Andres Gonzalez ***/

@Getter
@AllArgsConstructor
public enum Errors {
	client_does_not_exist("200", "No existe cliente."), empty_password("201", "Password vacio."),
	password_exists("202", "Password ya fue asignado."),
	password_not_assigned("203", "Debe solicitar su clave a Adiministracion."),
	more_than_one("204", "Existe mas de un cliente con ese cuit."), wrong_password("205", "Password incorrecto.");

	private String code;
	private String description;
}
