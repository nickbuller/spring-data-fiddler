package fiddler.dao.repository.container;

import fiddler.dao.entities.container.ContainerType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

/**
 * Created by nickb on 04/12/16.
 */
public interface ContainerTypeRepository extends CrudRepository<ContainerType, Long> {
	@Query("select o from ContainerType o")
	Stream<ContainerType> streamAll();
}
