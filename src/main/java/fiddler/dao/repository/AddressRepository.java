package fiddler.dao.repository;

import fiddler.dao.entities.address.Address;
import fiddler.dao.entities.address.SaneAddress;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
	@Query("select o from Address o")
	Stream<Address> streamAll();

	SaneAddress findSaneAddressById(Long id);
}