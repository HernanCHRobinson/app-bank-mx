package ar.com.viewpaymentsb.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorUser {
	USER_SAVE("0901", "Error guardando usuario."), USER_FIND("0902", "Error buscando usuario."),
	USER_INTERN("0903", "Error si usuario es interno."),
	USER_VINCULATED("0904", "Error buscando lista de vinvulo de entidades."),
	USER_RELATED("0905", "Error verificando relacion usuario persona."),
	USER_LIST("0906", "Error buscando lista de personas backoffice."),
	USER_GETROL("0907", "Error buscando rol de usuario."),
	USER_GETROLGROUP("0908", "Error buscando rol-grupo-rol de usuario.");

	private String code;
	private String description;
	
	public String getMessageFull() {
		return this.description + "(Cod " + this.code + ")";
	}
}
