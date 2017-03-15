package fiddler.dao.repository.container;

import fiddler.dao.entities.container.ContainerOrganisationMembership;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface ContainerOrganisationMembershipRepository extends CrudRepository<ContainerOrganisationMembership, Long> {
	@Query("select o from ContainerOrganisationMembership o order by o.id")
	Stream<ContainerOrganisationMembership> streamAll(Pageable pageable);

//    Stream<ContainerOrganisationMembership> findByContainerType(ContainerType containerType);
}
