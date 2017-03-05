package fiddler;


import fiddler.dao.entities.Container;
import fiddler.dao.repository.ContainerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.transaction.Transactional;

@SpringBootApplication
@ComponentScan
public class Application implements CommandLineRunner {
    Logger LOG = LoggerFactory.getLogger(Application.class);

    @Autowired
    ContainerRepository containerRepository;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        LOG.error("Hello");

        Container container = containerRepository.findOne(1L);
        LOG.info(container.getId().toString());
        LOG.info(container.toString());
        LOG.info(container.getId().toString());


    }
}
