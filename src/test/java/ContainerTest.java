import fiddler.Application;
import fiddler.dao.entities.Container;
import fiddler.dao.repository.ContainerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by nbuller on 06/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles()

public class ContainerTest {
    Logger LOG = LoggerFactory.getLogger(ContainerTest.class);
    @Inject
    ContainerRepository repository;

    @Test
    @Transactional
    public void testRepositoryFindByType() {
        repository.findByContainerTypeIdOrderById(15L).forEach(TestUtils::validateToString);
    }

    @Test
    @Transactional
    public void testFindAll() {

        LOG.info(String.valueOf(repository.findAll().spliterator().getExactSizeIfKnown()));

        repository.findAll().forEach(TestUtils::validateToString);
    }

    @Test
    @Transactional
    public void testChildrenOfRootContainer() {
        Container rootContainer = repository.findOne(1L);

        Assert.assertNotNull(rootContainer);

    }
}
