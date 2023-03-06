//package ar.com.viewpaymentsb.entities;
//
//import java.math.BigInteger;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@Entity
//@NoArgsConstructor
//@Builder
//@AllArgsConstructor
//@Table(name = "datosempresa")
//public class DataCompany {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "idempresa")
//	private BigInteger id;
//	@Column(name = "nombre")
//	private String name;
//	@Column(name = "direccion")
//	private String direction;
//	@Column(name = "cuitempresa")
//	private String cuit;
//	@Column(name = "iibb")
//	private String iibb;
//	@Column(name = "telefono")
//	private String telephone;
//	@Column(name = "fechainicio")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date startOfActivity;
//	@Transient
//	private String startOfActivityPatternESP;
//	@Transient
//	private String startOfActivityPatternUSA;
//}
