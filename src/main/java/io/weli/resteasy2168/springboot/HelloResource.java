package io.weli.resteasy2168.springboot;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")
public class HelloResource {
    @GET
    public String get() {
        return "Hello, world!";
    }
}
