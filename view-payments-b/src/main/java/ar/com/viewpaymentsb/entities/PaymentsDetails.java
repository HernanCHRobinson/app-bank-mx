//package ar.com.viewpaymentsb.entities;
//
//import java.math.BigDecimal;
//import java.math.BigInteger;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
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
//@Table(name = "facturaventadetalle")
//public class PaymentsDetails {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private BigInteger id;
//	@Column(name = "codigofactura")
//	private BigInteger code;
//	@Column(name = "cantidad")
//	private Integer productCount;
//	@Column(name = "producto")
//	private String productCode;
//	@Column(name = "descripcion")
//	private String productDescription;
//	@Column(name = "preciounitario")
//	private BigDecimal unitary;
//	@Column(name = "descuento")
//	private BigDecimal discount;
//	@Column(name = "preciototal")
//	private BigDecimal total;
//
//}