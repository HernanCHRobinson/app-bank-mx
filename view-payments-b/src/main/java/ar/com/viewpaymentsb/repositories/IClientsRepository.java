//package ar.com.viewpaymentsb.repositories;
//
//import java.math.BigInteger;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import ar.com.viewpaymentsb.entities.Clients;
//
//@Repository
//public interface IClientsRepository extends JpaRepository<Clients, BigInteger> {
//
//	@Query(value = "select c from Clients c where c.cuit=?1")
//	Optional<Clients> byCuit(String cuit);
//
//	@Query(value = "select count(c.code) from Clients c where c.cuit=?1")
//	BigInteger countClients(String cuit);
//
//}
