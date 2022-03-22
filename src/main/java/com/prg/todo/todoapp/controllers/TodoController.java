package com.prg.todo.todoapp.controllers;


import com.prg.todo.todoapp.objects.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/todo")
public class TodoController {

    @GetMapping(path = "/all", produces = "application/json")
    public List<Todo> fetchAll() {
        return Arrays.asList(new Todo("1", "Learn AKS", new Date(), false));
    }

}
