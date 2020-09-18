package com.demo.bastienche.osgi.todolist.todo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.demo.bastienche.osgi.todolist.todo.dao.TodoDAO;
import com.demo.bastienche.osgi.todolist.todo.dao.dto.TodoDTO;

@Component
public class LocalTodoImpl implements TodoDAO{

	ArrayList<TodoDTO> localTodos;
	
	@Override
	public TodoDTO getTodo(Long todoID) {
		if(todoID == null) return null;
		
		for(TodoDTO todo : this.localTodos) {
			if(todo.todoID.equals(todoID)) return todo;
		}
		return null;
	}

	@Override
	public List<TodoDTO> getTodos() {
		return localTodos;
	}

	@Override
	public Long addTodo(TodoDTO todoDTO) {
		if(todoDTO.todoID == null) return null;
		
		this.localTodos.add(todoDTO);
		return this.getTodo(todoDTO.todoID).todoID;
	}

	@Override
	public boolean deleteTodo(Long todoID) {
		if(todoID == null) return false;
		
		for( int i =0; i < this.localTodos.size(); i++) {
			if(this.localTodos.get(i).todoID.equals(todoID)) { 
				this.localTodos.remove(i);
				return true;
			}
		}
		return false;
	}

}
