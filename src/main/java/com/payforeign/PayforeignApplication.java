package com.payforeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PayforeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayforeignApplication.class, args);
    }
}
