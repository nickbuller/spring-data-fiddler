package fiddler.dao.repository;

import fiddler.dao.entities.Container;
import fiddler.dao.entities.ContainerType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContainerRepository extends CrudRepository<Container, Long> {
    List<Container> findByContainerTypeIdOrderById(Long containerTypeId);

    List<Container> findByContainerType(ContainerType containerType);
}
