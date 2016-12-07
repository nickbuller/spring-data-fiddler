import fiddler.Application;
import fiddler.dao.repository.ContainerTypeRepository;
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
public class ContainerTypeTest {
    @Inject
    ContainerTypeRepository containerTypeRepository;

    @Test
    @Transactional
    public void testRepositoryFindByType() {
        TestUtils.validateToString(containerTypeRepository.findOne(40L));

    }

    @Test
    @Transactional
    public void testRepositoryFindAll() {
        containerTypeRepository.findAll().forEach(containerType -> TestUtils.validateToString(containerType));
    }

}
