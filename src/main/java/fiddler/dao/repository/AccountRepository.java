package fiddler.dao.repository;

import fiddler.dao.entities.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nbuller on 07/12/16.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}