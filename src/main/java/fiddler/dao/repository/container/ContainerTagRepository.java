package fiddler.dao.repository.container;

import fiddler.dao.entities.container.ContainerTag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ContainerTagRepository extends CrudRepository<ContainerTag, Long> {
	@Query("select o from ContainerTag o")
	Stream<ContainerTag> streamAll();
}
