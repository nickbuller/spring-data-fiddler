import org.apache.commons.lang3.SerializationUtils;
import org.junit.Assert;

import javax.persistence.EntityNotFoundException;
import java.io.Serializable;


//{
//    id=1,
//    name='Root',
//    description='',
//    isPrivate=true,
//    owningOrganisationId=1,
//    creator=Person(id=1,personTypeId=1,name=Root1234,scope=USER,password=[-116,100,-74,113,30,-9,12,65,117,-18,-83,-26,83,118,82,-102,-112,-64,-97,-44],salt=VucnzYq5srQ=,digest=XTibMuLVB7b7vtJQjWs7fw==,addressId=null,localeId=1,createdTs=null,modifiedTs=2014-12-11T13:09:43.338,alias=null),
//    createdts=2010-08-30T20:22:03.096,
//    modifiedTs=2010-08-30T20:22:05.671,
//    modifier=Person(id=1,personTypeId=1,name=Root1234,scope=USER,password=[-116,100,-74,113,30,-9,12,65,117,-18,-83,-26,83,118,82,-102,-112,-64,-97,-44],salt=VucnzYq5srQ=,digest=XTibMuLVB7b7vtJQjWs7fw==,addressId=null,localeId=1,createdTs=null,modifiedTs=2014-12-11T13:09:43.338,alias=null)
//}
//{
//    id=1,
//    name='Root',
//    description='',
//    isPrivate=true,
//    owningOrganisationId=1,
//    creator=Person(id=1,personTypeId=1,name=Root1234,scope=USER,password=[-116,100,-74,113,30,-9,12,65,117,-18,-83,-26,83,118,82,-102,-112,-64,-97,-44],salt=VucnzYq5srQ=,digest=XTibMuLVB7b7vtJQjWs7fw==,addressId=null,localeId=1,createdTs=null,modifiedTs=2014-12-11T13:09:43.338,alias=null),
//    createdts=2010-08-30T20:22:03.096,
//    modifiedTs=2010-08-30T20:22:05.671,
//    modifier=Person(id=1,personTypeId=1,name=Root1234,scope=USER,password=[-116,100,-74,113,30,-9,12,65,117,-18,-83,-26,83,118,82,-102,-112,-64,-97,-44],salt=VucnzYq5srQ=,digest=XTibMuLVB7b7vtJQjWs7fw==,addressId=null,localeId=1,createdTs=null,modifiedTs=2014-12-11T13:09:43.338,alias=null)
//}


/**
 * Created by nbuller on 07/12/16.
 */
public class TestUtils {
	static void validateStandardOverrideMethods(Serializable instance) {
		validateToString(instance);
		validateEquals(instance);
		validateHashCode(instance);
	}

	static void validateToString(Object instance) {
		Assert.assertNotNull(instance);
		try {
			instance.toString();
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	static void validateEquals(Serializable instance) {
		Assert.assertNotNull(instance);
		try {
			Serializable clone = SerializationUtils.clone(instance);
			Assert.assertEquals(instance, clone);
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	static void validateHashCode(Serializable instance) {
		Assert.assertNotNull(instance);
		try {
			Serializable clone = SerializationUtils.clone(instance);
			Assert.assertEquals(instance.hashCode(), clone.hashCode());
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
}
