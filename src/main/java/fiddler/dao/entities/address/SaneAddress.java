package fiddler.dao.entities.address;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by nickb on 15/03/17.
 */
public interface SaneAddress {
	@Value("#{target.getAddressTagValues().?[addressTag.tag.name =='Line 1'][0].value.stringValue}")
	String getFirstLine();

	@Value("#{target.getAddressTagValues().?[addressTag.tag.name =='City/Town'][0].value.stringValue}")
	String getSecondLine();

	@Value("#{target.getAddressTagValues().?[addressTag.tag.name =='Province/State'][0].value.stringValue}")
	String getThirdLine();

	@Value("#{target.getAddressTagValues().?[addressTag.tag.name =='Post Code'][0].value.stringValue}")
	String getPostcode();

	@Value("#{target.getAddressTagValues().?[addressTag.tag.name =='Country'][0].value.stringValue}")
	String getCountry();
}
