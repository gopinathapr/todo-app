package com.prg.todo.todoapp.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Todo {
    private String id;
    private String msg;
    private Date date;
    private boolean done;
}
