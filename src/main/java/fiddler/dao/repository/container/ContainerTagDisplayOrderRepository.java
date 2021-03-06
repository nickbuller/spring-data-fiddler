package fiddler.dao.repository.container;

import fiddler.dao.entities.container.ContainerTagDisplayOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

public interface ContainerTagDisplayOrderRepository extends CrudRepository<ContainerTagDisplayOrder, Long> {
	@Query("select o from ContainerTagDisplayOrder o")
	Stream<ContainerTagDisplayOrder> streamAll();
}
