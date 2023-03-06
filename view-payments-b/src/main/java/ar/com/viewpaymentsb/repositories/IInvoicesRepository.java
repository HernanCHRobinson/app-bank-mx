//package ar.com.viewpaymentsb.repositories;
//
//import java.math.BigInteger;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import ar.com.viewpaymentsb.entities.Payments;
//
//@Repository
//public interface IInvoicesRepository extends JpaRepository<Payments, BigInteger> {
//
//	@Query(value = "select i from Invoices i where i.clientCuit=?1 and ( i.invoiceDate>=?2 and i.invoiceDate<=?3) order by i.invoiceDate desc")
//	List<Payments> getInvoices(String clientCuit,Date from,Date to);
//	
//	@Query(value = "select i from Invoices i where i.code=?1 ")
//	Optional<Payments> getInvoice(BigInteger code);
//
//}
