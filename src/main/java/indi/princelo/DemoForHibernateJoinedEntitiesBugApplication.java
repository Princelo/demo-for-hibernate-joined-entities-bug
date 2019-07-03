package indi.princelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("indi.princelo.repository")
@SpringBootApplication
public class DemoForHibernateJoinedEntitiesBugApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoForHibernateJoinedEntitiesBugApplication.class, args);
    }

}
