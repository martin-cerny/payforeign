package com.payforeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PayforeignApplication {

    @RequestMapping(value = {"", "/"})
    public String index() {
        return "Running ...";
    }

    public static void main(String[] args) {
        SpringApplication.run(PayforeignApplication.class, args);
    }
}
