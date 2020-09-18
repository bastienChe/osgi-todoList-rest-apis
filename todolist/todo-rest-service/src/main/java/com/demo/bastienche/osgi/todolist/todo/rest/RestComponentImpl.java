package com.demo.bastienche.osgi.todolist.todo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.demo.bastienche.osgi.todolist.todo.dao.TodoDAO;
import com.demo.bastienche.osgi.todolist.todo.dao.dto.TodoDTO;
import com.demo.bastienche.osgi.todolist.todo.dao.impl.LocalTodoImpl;


@Component(service=RestComponentImpl.class)
@JaxrsResource
//@Produces(MediaType.APPLICATION_JSON)
@HttpWhiteboardResource(pattern="/microservice/*", prefix="static")

@Path("/rest")
public class RestComponentImpl {
    
    //TODO add an implementation

    @GET
    public String toUpper() {
        return "Hello World!orld!orld!";
    }
	
    // ERREUR REFERENCE
//    @Reference
//	private TodoDAO todoDAO;
	
  @Path("{id}")
  @GET
  public String getTodo(@PathParam("id") String id) {
	  
	  // ERREUR
	  return id;
//		TodoDTO myTodo = new TodoDTO();
//		myTodo.todoID = Long.valueOf(id);
//		myTodo.description = "desc";
//		myTodo.priority = TodoDTO.Priority.MEDIUM;
//		myTodo.title = "title";
//		
//		return myTodo.description;
  }

  
//  @Path("{todolist}")
//  @POST
//  public Long addTodo() {
////  	TodoDTO myTodo = new TodoDTO();
////  	myTodo.todoID = Long.valueOf(1);
////  	myTodo.description = "desc";
////  	myTodo.priority = TodoDTO.Priority.MEDIUM;
////  	myTodo.title = "title";
////  	
//  	System.out.println("DKKDK");
////  	return this.tododao.addTodo(myTodo);
//  	return null;
//  }
    
}