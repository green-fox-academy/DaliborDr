package com.greenfox.dadis.databasespring;

import com.greenfox.dadis.databasespring.models.Todo;
import com.greenfox.dadis.databasespring.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabasespringApplication implements CommandLineRunner {

    private TodoInterface repo;

    @Autowired
    public DatabasespringApplication(TodoInterface repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabasespringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repo.save(new Todo("I have to learn Object Relational Mapping"));

    }
}
