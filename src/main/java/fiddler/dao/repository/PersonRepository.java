package fiddler.dao.repository;

import fiddler.dao.entities.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Account, Long> {
}