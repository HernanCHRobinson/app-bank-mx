package ar.com.viewpaymentsb.models;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ClientsModel {
	private BigInteger code;
	private String name;
	private String cuit;
	private String password;
	private Boolean auth;
	private String message;
	
}