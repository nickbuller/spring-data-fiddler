import fiddler.Application;
import fiddler.dao.generated.Account;
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
    public void testAccount() {

        Account account = accountRepository.findOne(1L);
        Assert.assertNotNull(account);
    }
}