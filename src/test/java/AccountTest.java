import fiddler.Application;
import fiddler.dao.entities.account.Account;
import fiddler.dao.repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles()
public class AccountTest {

    @Autowired
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
		accountRepository.findAll().forEach(TestUtils::validateStandardOverrideMethods);
	}

}
