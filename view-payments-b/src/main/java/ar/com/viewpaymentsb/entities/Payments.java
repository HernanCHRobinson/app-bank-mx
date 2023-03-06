//package ar.com.viewpaymentsb.entities;
//
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.util.Date;
//import java.util.List;
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
//@Table(name = "facturaventa")
//public class Payments {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "Codigo")
//	private BigInteger code;
//	@Column(name = "cuit")
//	private String clientCuit;
//	@Column(name = "cliente")
//	private Integer clientNumber;
//	@Column(name = "razonsocial")
//	private String clientName;	
//	@Column(name = "tipodoc")
//	private String invoiceType;
//	@Column(name="puntoventa")
//	private String invoicePointOfSale;
//	@Column(name="nrofactura")
//	private String invoiceNumber;
//	@Column(name = "fecha")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date invoiceDate;
//	@Column(name = "total")
//	private BigDecimal invoiceTotal;
//	@Column(name = "saldo")
//	private BigDecimal invoiceBalance;
//	@Column(name="cae")
//	private String invoiceCAE;
//	@Column(name="caev")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date invoiceExpiration;
//	@Column(name="barra")
//	private String invoiceBarcode;
//	@Transient
//	private Boolean invoicePaid;
//	@Transient
//	private String invoicePaidPattern;
//	@Transient
//	private String invoiceDatePatternESP;
//	@Transient
//	private String invoiceDatePatternUSA;
//	@Transient
//	private String invoiceExpirationPatternESP;
//	@Transient
//	private String invoiceExpirationPatternUSA;
//	@Transient
//	private List<PaymentsDetails> detail;
//	
//	
//}