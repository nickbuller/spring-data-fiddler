import fiddler.Application;
import fiddler.dao.generated.Account;
import fiddler.dao.repository.PersonRepository;
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
public class PersonTest {

    @Inject
    PersonRepository repository;

    @Test
    @Transactional
    public void testRepositoryFindOne() {

        Account account = repository.findOne(1L);
        Assert.assertNotNull(account);
        TestUtils.validateToString(account);
    }

    @Test
    @Transactional
    public void testRepositoryFindAll() {
        repository.findAll().forEach(account -> TestUtils.validateToString(account));
    }

}
