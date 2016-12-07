package fiddler;

import fiddler.dao.repository.ContainerRepository;
import fiddler.dao.repository.ContainerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Application {
    private
    @Autowired
    ContainerRepository containerRepository;
    private
    @Autowired
    ContainerTypeRepository containerTypeRepository;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(ContainerTypeRepository containerTypeRepository, ContainerRepository containerRepository) {
//        return new CommandLineRunner() {
//            @Override
//            @Transactional
//            public void run(String... args) throws Exception {
//                containerTypeRepository.findAll().forEach(containerType -> System.out.println(containerType));
//
//                ContainerType containerType = containerTypeRepository.findOne(40L);
//                containerRepository.findByContainerType(containerType).forEach(container -> dumpContainer(container));
//            }
//        };
//    }
//    void dumpContainer(Container container) {
//        try {
//            System.out.println(container);
//        } catch (EntityNotFoundException e) {
//        }
//    }
}
