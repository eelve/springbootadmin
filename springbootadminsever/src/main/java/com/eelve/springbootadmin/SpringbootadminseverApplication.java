package com.eelve.springbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringbootadminseverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootadminseverApplication.class, args);
    }

}
