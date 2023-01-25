package com.unique.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.unique.db.Student;

@Path("/service")
public class MainResources {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String Hello() {
        return "Hello World!";
    }
    
    
    
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response AddStudent(@FormParam("fname") String fname,@FormParam("fname") String lname)
    {
    	Student st = new Student(fname,lname);
    	return Response.ok(st).build();
    }
    
    
}
