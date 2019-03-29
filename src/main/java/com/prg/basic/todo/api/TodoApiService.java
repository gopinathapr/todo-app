package com.prg.basic.todo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prg.basic.todo.dto.Todo;

/**
 * List of api's for saving a TODO in an inmemory database
 * 
 * @author PRG
 *
 */
@RestController("/api/todo")
public class TodoApiService {

	/**
	 * Save a given ToDo
	 * 
	 * @param todo
	 * @return
	 */
	@PostMapping()
	public ResponseEntity saveToDo(Todo todo) {

		return null;
	}
}
