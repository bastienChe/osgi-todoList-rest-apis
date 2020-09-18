package com.demo.bastienche.osgi.todolist.todo.dao;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import com.demo.bastienche.osgi.todolist.todo.dao.dto.TodoDTO;

@ProviderType
public interface TodoDAO {

	public TodoDTO getTodo(Long todoID);

	public List<TodoDTO> getTodos();
	
	public Long addTodo(TodoDTO todoDTO);
	
	public boolean deleteTodo(Long todoID);
	
}
