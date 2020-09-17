package br.com.stomm.address;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import br.com.stomm.address.model.Address;
import br.com.stomm.address.repository.AddressRepository;

@DataJpaTest
public class AddressTest {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Test
	@Rollback(false)
	public void testCreate(){
		Address address = new Address("Campinas", "antiga", "Brasil", 0, 2, "Valença", 10, "SP", "Rua Teste", 125);
		Address saveAddress =addressRepository.save(address);
		
		assertNotNull(saveAddress);
		
	}
	

}
