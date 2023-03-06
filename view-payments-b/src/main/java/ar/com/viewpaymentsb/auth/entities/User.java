package ar.com.viewpaymentsb.auth.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Usuarios")
public class User {

	@Id
	@Column(name = "usr_nro")
	private BigInteger id;
	@Column(name = "usr_name", nullable = false)
	private String name;
	@Column(name = "usr_mail", nullable = false)
	private String username;
	@Column(name = "usr_tusr_tipo_usuario_sistema", nullable = false)
	private Short systemType;
	@Column(name = "usr_pwd", nullable = false)
	private String password;
	@Column(name = "usr_activo", nullable = false)
	private boolean active;
	@Column(name = "usr_falta", nullable = false)
	private Date registrationDate;
	@Column(name = "usr_fbaja")
	private Date unsubscribeDate;

}

