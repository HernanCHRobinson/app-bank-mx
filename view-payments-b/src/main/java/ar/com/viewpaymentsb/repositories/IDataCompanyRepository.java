package ar.com.viewpaymentsb.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.viewpaymentsb.entities.DataCompany;

@Repository
public interface IDataCompanyRepository extends JpaRepository<DataCompany,BigInteger>{
}