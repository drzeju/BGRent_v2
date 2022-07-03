package com.bgrent.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.bgrent.library.*","com.bgrent.admin.*"})
@EnableJpaRepositories(basePackages = {"com.bgrent.library.repository"})
@EntityScan(basePackages = {"com.bgrent.library.model"})
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
