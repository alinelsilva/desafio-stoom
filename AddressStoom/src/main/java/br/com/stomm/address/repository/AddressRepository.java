package br.com.stomm.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stomm.address.model.Address;


@Repository
public interface AddressRepository extends   JpaRepository<Address, Long> {
	
	Address findById(long id);

}
