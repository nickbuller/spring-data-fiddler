import fiddler.Application;
import fiddler.dao.repository.ContainerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
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
    @Inject
    ContainerRepository containerRepository;

    @Test
    @Transactional
    public void testRepositotyFindByType() {
        containerRepository.findByContainerTypeIdOrderById(15L).forEach(container -> TestUtils.validateToString(container));
    }

    @Test
    @Transactional
    public void testFindAll() {
        containerRepository.findAll().forEach(container -> TestUtils.validateToString(container));
    }
}
