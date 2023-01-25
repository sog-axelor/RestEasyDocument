package com.unique.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.unique.db.Student;
import com.unique.db.StudentData;

@Path("/service")
public class MainResources {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String Hello() {
        return "Hello World!";
    }
    
    
    
    @POST				//1.method post to post value in json method
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response AddStudent(@FormParam("fname") String fname,@FormParam("fname") String lname)
    {
    	Student st = new Student(fname,lname);
    	return Response.ok(st).build();
    }
    
    
    @GET				//2.method get to fetch the value in json method
    @Path("getValue/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student GetStudent(@PathParam("id") int id) {
      	
    	return StudentData.getStudentById(id);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
