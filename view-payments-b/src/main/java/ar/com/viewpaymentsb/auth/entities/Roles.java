package ar.com.viewpaymentsb.auth.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
//@Entity
//@Table(name = "Roles", schema = "Sistema")
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rol_id")
	private Integer id;
	@Column(name = "rol_name")
	private String name;
}