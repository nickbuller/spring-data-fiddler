import fiddler.Application;
import fiddler.dao.repository.container.ContainerTypeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles()
public class ContainerTypeTest {
    private static final Logger LOG = LoggerFactory.getLogger(ContainerTypeTest.class);

    @Autowired
    ContainerTypeRepository repository;

    @Test
    @Transactional
    public void testRepositoryFindByType() {
        TestUtils.validateToString(repository.findOne(40L));

    }

    @Test
    @Transactional
    public void testRepositoryFindAll() {
//        LOG.info(String.valueOf(repository.findAll().spliterator().getExactSizeIfKnown()));
        repository.findAll().forEach(TestUtils::validateStandardOverrideMethods);
    }
}
