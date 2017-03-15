package fiddler.dao.repository.container;

import fiddler.dao.entities.container.Container;
import fiddler.dao.entities.container.ContainerType;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ContainerRepository extends CrudRepository<Container, Long> {
	@Query("select c from Container c order by c.id")
	Stream<Container> streamAll(Pageable pageable);

	@Query("select c from Container c where container_type_id = :typeId order by c.id")
	Stream<Container> findByContainerTypeId(@Param("typeId") Long containerTypeId);

	Stream<Container> findByContainerType(ContainerType containerType);
}
