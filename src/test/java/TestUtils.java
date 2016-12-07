import org.junit.Assert;

import javax.persistence.EntityNotFoundException;

/**
 * Created by nbuller on 07/12/16.
 */
public class TestUtils {
    public static void validateToString(Object o) {
        Assert.assertNotNull(o);
        try {
            o.toString();
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

}
