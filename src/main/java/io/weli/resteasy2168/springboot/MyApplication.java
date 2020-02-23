package io.weli.resteasy2168.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.ws.rs.ApplicationPath;

@SpringBootApplication
/*
 * 如果path设置为`/`，那么'/actuator'就会失效。
 */
@ApplicationPath("/rest")
public class MyApplication extends javax.ws.rs.core.Application {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
