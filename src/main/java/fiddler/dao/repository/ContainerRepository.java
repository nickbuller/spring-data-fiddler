package fiddler.dao.repository;

import java.util.List;

import fiddler.dao.entities.ContainerType;
import fiddler.dao.entities.Container;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerRepository extends CrudRepository<Container, Long> {
    List<Container> findByContainerTypeIdOrderById(Long containerTypeId);

    List<Container> findByContainerType(ContainerType containerType);
}
