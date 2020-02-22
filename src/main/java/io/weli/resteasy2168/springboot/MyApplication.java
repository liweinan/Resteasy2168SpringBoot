package io.weli.resteasy2168.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@SpringBootApplication
@ApplicationPath("/")
public class MyApplication extends javax.ws.rs.core.Application {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
