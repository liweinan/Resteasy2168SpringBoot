package io.weli.resteasy2168.springboot;

import org.springframework.stereotype.Component;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Component
@Path("/hello")
public class HelloResource {
    @GET
    public String get() {
        return "Hello, world!";
    }
}
