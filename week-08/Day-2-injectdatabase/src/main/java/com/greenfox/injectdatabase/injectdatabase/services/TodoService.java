package com.greenfox.injectdatabase.injectdatabase.services;

import com.greenfox.injectdatabase.injectdatabase.models.Todo;
import com.greenfox.injectdatabase.injectdatabase.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private TodoInterface repo;

    @Autowired
    public TodoService(TodoInterface repo) {
        this.repo = repo;
    }

    public List<Todo> getOnlyActive() {
        List<Todo> todos = new ArrayList<>();
        repo.findAll().forEach(todos ::add);
        return todos.stream().filter(todo -> todo.isDone()==false).collect(Collectors.toList());
    }

}
