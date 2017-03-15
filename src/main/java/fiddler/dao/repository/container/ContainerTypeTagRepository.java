package fiddler.dao.repository.container;

import fiddler.dao.entities.container.ContainerTypeTag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

/**
 * Created by nickb on 04/12/16.
 */
public interface ContainerTypeTagRepository extends CrudRepository<ContainerTypeTag, Long> {
	@Query("select o from ContainerTypeTag o")
	Stream<ContainerTypeTag> streamAll();

}
