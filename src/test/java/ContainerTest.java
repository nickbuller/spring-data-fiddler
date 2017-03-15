import fiddler.Application;
import fiddler.dao.entities.container.Container;
import fiddler.dao.repository.container.ContainerRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles()

public class ContainerTest {
	final Logger LOG = LoggerFactory.getLogger(ContainerTest.class);
	@Autowired
	ContainerRepository repository;

    @Test
	@Ignore
	@Transactional
    public void testRepositoryFindByType() {
		repository.findByContainerTypeId(15L).forEach(TestUtils::validateStandardOverrideMethods);
	}

    @Test
	@Ignore
	@Transactional
    public void testFindAll() {

        LOG.info(String.valueOf(repository.findAll().spliterator().getExactSizeIfKnown()));

		repository.findAll().forEach(TestUtils::validateStandardOverrideMethods);
	}

	@Test
	@Ignore
	@Transactional
	public void testRepositoryStreamFindAll() {
		try (Stream<Container> stream = repository.streamAll(new PageRequest(1, 100))) {
			stream.forEach(TestUtils::validateStandardOverrideMethods);
		}
	}

    @Test
    @Transactional
    public void testChildrenOfRootContainer() {
        Container rootContainer = repository.findOne(1L);
        Assert.assertNotNull(rootContainer);
    }
}
