package com.greenfox.springinjection.dependencies.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public List<String> addStudent(String name) {
        names.add(name);
        return names;
    }

    public void save(String student) {
        names.add(student);
    }
}
