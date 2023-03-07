package ar.com.viewpaymentsb.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "datacompany")
public class DataCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dc_id")
	private BigInteger id;
	@Column(name = "dc_name")
	private String name;
	@Column(name = "dc_direction")
	private String direction;
	@Column(name = "dc_cuit")
	private String cuit;
	@Column(name = "dc_iibb")
	private String iibb;
	@Column(name = "dc_phone")
	private String telephone;
	@Column(name = "dc_startofactivity")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startOfActivity;
	@Transient
	private String startOfActivityPatternESP;
	@Transient
	private String startOfActivityPatternUSA;
}
