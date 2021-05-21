package com.cts.rest;

import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	StudentDao std=new StudentDao();

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<student> get() {
        return StudentDao.getAllStudents();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id")int id) {
        student std= StudentDao.getStudent(id);
        if(std==null)
        {
        	return Response
        		      .status(Response.Status.NOT_FOUND)
        		      .entity("not a valid input")
        		      .build();
        }
        return Response
  		      .status(Response.Status.OK)
  		      .entity(std)
  		      .build(); 
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public String addStudent(student std) {
        int m= StudentDao.addStudent(std);
        if(m!=1)
        {
        	return "FAILURE_RESULT";
        }
        return "SUCCESSSFUL";
    }
    
    @DELETE
    @Path("/{id}")
    @Consumes({ MediaType.APPLICATION_JSON} )
    @Produces({ MediaType.APPLICATION_JSON} )
    public String deleteStudent(@PathParam("id") int id) {
        
    	int m= StudentDao.deleteStudent(id);
        if(m!=1)
        {
        	return "FAILURE_RESULT";
        }
        return "SUCCESSSFUL";
    }
    
    @PUT
    @Consumes({ MediaType.APPLICATION_JSON} )
    @Produces({ MediaType.APPLICATION_JSON} )
    public String updateStudent(student std) {
    	int m= StudentDao.updateStudent(std);
        if(m!=1)
        {
        	return "FAILURE_RESULT";
        }
        return "SUCCESSSFUL";
    }
    
}
