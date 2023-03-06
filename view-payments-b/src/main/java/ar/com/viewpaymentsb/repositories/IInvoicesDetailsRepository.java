//package ar.com.viewpaymentsb.repositories;
//
//import java.math.BigInteger;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import ar.com.viewpaymentsb.entities.PaymentsDetails;
//
//@Repository
//public interface IInvoicesDetailsRepository extends JpaRepository<PaymentsDetails, BigInteger> {
//
//	@Query(value = "select i from InvoicesDetails i where i.code=?1 ")
//	List<PaymentsDetails> getInvoiceDetail(BigInteger code);
//
//}
