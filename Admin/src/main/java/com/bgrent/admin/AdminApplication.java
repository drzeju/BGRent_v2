package com.bgrent.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bgrent.library.*")
@ComponentScan(basePackages = {"com.bgrent.library.service"})
@EnableJpaRepositories(basePackages = {"com.bgrent.library.repository"})
//@EnableJpaRepositories(basePackageClasses = com.bgrent.library.repository.AdminRepository.class)
@EntityScan(basePackages = {"com.bgrent.library.model"})
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
