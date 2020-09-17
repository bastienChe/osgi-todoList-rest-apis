package com.demo.bastienche.osgi.todolist.todo.dao;

import java.util.List;

import com.demo.bastienche.osgi.todolist.todo.dao.dto.TodoDTO;

public interface TodoDAO {

	public TodoDTO getTodo(Long todoID);

	public List<TodoDTO> getTodos(Long todoID);
	
	public Long addTodo(TodoDTO todoDTO);
	
	public boolean deleteTodo(Long todoID);
	
}
