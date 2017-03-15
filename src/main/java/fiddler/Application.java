package fiddler;


import fiddler.dao.entities.address.Address;
import fiddler.dao.entities.address.SaneAddress;
import fiddler.dao.repository.AddressRepository;
import fiddler.dao.repository.container.*;
import fiddler.dao.repository.tag.TagDataRepository;
import fiddler.dao.repository.tag.TagFormatRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.transaction.Transactional;

@SpringBootApplication
@EnableJpaRepositories()
@ComponentScan
public class Application implements CommandLineRunner {
	Logger LOG = LoggerFactory.getLogger(Application.class);

	@Autowired
	ContainerRepository containerRepository;
	@Autowired
	ContainerTypeRepository containerTypeRepository;
	@Autowired
	TagDataRepository tagDataRepository;
	@Autowired
	TagFormatRepository tagFormatRepository;
	@Autowired
	ContainerTagRepository containerTagRepository;
	@Autowired
	ContainerTypeTagRepository containerTypeTagRepository;
	@Autowired
	ContainerTagDisplayOrderRepository containerTagDisplayOrderRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	ContainerOrganisationMembershipRepository containerOrganisationMembershipRepository;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) {
		LOG.error("Hello");

//        LOG.info("TagFormat : {} Records", containerOrganisationMembershipRepository.streamAll().count());
//		containerOrganisationMembershipRepository.streamAll(new PageRequest(0, 1))
//			.forEach(entity -> LOG.info(
//				entity.getId().getContainer().getId().toString() +
//					" " +
//					entity.getId().getOrganisation().getId().toString())
//			);
//        ContainerOrganisationMembership containerOrganisationMembership = containerOrganisationMembershipRepository.findOne(95L);
//        LOG.info(containerOrganisationMembership.toString());

//        LOG.info("TagFormat : {} Records", tagFormatRepository.streamAll().count());
//        tagFormatRepository.streamAll().forEach(entity -> LOG.info(entity.toString()));

//        LOG.info("ContainerTag : {} Records", containerTypeRepository.streamAll().count());
//        containerTypeRepository.streamAll().forEach(entity -> LOG.info(entity.toString()));

//        LOG.info("Address : {} Records", addressRepository.streamAll().count());
//        addressRepository.streamAll()
//                .peek(entity -> LOG.info(entity.toString()))
//                .forEach(entity -> entity.getAddressTagValues().forEach(tagValue -> LOG.info(tagValue.getDebugString())));
//
		Address address = addressRepository.findOne(8770L);
		LOG.info(address.toString());
		address.getAddressTagValues().forEach(tagValue -> LOG.info(tagValue.getDebugString()));

		SaneAddress saneAddress = addressRepository.findSaneAddressById(8770L);
		LOG.info(saneAddress.getFirstLine());
		LOG.info(saneAddress.getSecondLine());
		LOG.info(saneAddress.getThirdLine());
		LOG.info(saneAddress.getPostcode());
		LOG.info(saneAddress.getCountry());

//        LOG.info("ContainerTag : {} Records", containerTagRepository.streamAll().count());
//        containerTagRepository.streamAll().forEach(entity -> LOG.info(entity.toString()));

//        LOG.info("ContainerTypeTagRepository : {} Records", containerTypeTagRepository.streamAll().count());
//        containerTypeTagRepository.streamAll().forEach(entity -> LOG.info(entity.toString()));

//        LOG.info("ContainerTagDisplayOrderRepository : {} Records", containerTagDisplayOrderRepository.streamAll().count());
//        containerTagDisplayOrderRepository.streamAll().forEach(entity -> LOG.info(entity.toString()));

//        LOG.info("TagData : {} Records", tagDataRepository.streamAll().count());
//        LOG.info("Container : {} Records", containerRepository.streamAll().count());

//        tagFormatRepository.streamAll().forEach(tagFormat -> LOG.info(tagFormat.toString()));

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start(String.format("Container {%d}", 14510L));
//        Container container = containerRepository.findOne(14510L);
//        LOG.info(container.toString());
//        container.getContainerTagValues().forEach(containerTagValue -> LOG.info(containerTagValue.getDebugString()));
//        stopWatch.stop();
//        stopWatch.start("All Containers");
//
//        containerRepository.streamAll(new PageRequest(0, 1000))
//                .peek(c -> LOG.info(c.getId().toString()))
//                .forEach(c -> c.getContainerTagValues()
//                        .forEach(ctv -> LOG.info(ctv.getDebugString())));
//        stopWatch.stop();
//        LOG.info(stopWatch.prettyPrint());
	}
}

