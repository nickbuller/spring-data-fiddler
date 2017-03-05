import fiddler.Application;
import fiddler.dao.entities.Account;
import fiddler.dao.repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles()
public class AccountTest {

    @Inject
    AccountRepository accountRepository;

    @Test
    @Transactional
    public void testRepositoryFindOne() {

        Account account = accountRepository.findOne(1L);
        Assert.assertNotNull(account);
        TestUtils.validateToString(account);
    }

    @Test
    @Transactional
    public void testRepositoryFindAll() {
        accountRepository.findAll().forEach(TestUtils::validateToString);
    }

}
