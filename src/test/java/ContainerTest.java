import fiddler.Application;
import fiddler.dao.entities.Container;
import fiddler.dao.repository.ContainerRepository;
import org.assertj.core.util.Compatibility;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
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
    public void testContainer() {
        containerRepository.findByContainerTypeIdOrderById(15L).subList(1,10).forEach(container -> System.out.println(container));
    }
}
