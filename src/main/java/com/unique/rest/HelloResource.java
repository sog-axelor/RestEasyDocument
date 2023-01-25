package com.unique.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class HelloResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String Hello() {
        return "Hello World!";
    }
}
