package com.demo.bastienche.osgi.todolist.todo.dao.dto;

import java.util.Date;

public class TodoDTO {

	public enum Priority {LOW, MEDIUM, URGENT};
	
	public Long todoID;
	public Date resolveDate;
	public Date publishedDate;
	public String title;
	public String description;
	public Priority priority;
	
}
