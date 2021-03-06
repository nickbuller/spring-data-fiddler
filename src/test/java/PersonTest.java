import fiddler.Application;
import fiddler.dao.entities.account.Account;
import fiddler.dao.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonTest {
    @Autowired
    PersonRepository repository;

    @Test
    @Transactional
    public void testRepositoryFindOne() {
        Account account = repository.findOne(1L);
        Assert.assertNotNull(account);
		TestUtils.validateStandardOverrideMethods(account);
	}

    @Test
    @Transactional
    public void testRepositoryFindAll() {
        Logger LOG = LoggerFactory.getLogger(PersonTest.class);
        LOG.info(String.valueOf(repository.findAll().spliterator().getExactSizeIfKnown()));
//        repository.findAll().forEach(account -> TestUtils.validateToString(account));
    }

}
