package com.greenfox.injectdatabase.injectdatabase.services;

import com.greenfox.injectdatabase.injectdatabase.models.Todo;
import com.greenfox.injectdatabase.injectdatabase.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private TodoInterface repo;

    @Autowired
    public TodoService(TodoInterface repo) {
        this.repo = repo;
    }

    public List<Todo> getOnlyActive() {
        List<Todo> activeTodos = new ArrayList<>();
        repo.findAll().forEach();
        return
    }

}
