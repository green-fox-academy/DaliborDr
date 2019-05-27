package com.greenfox.foxwebapp.foxwebapp.services;

import com.greenfox.foxwebapp.foxwebapp.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceUtilities {

    List<Fox> foxes;

    public FoxServiceUtilities() {
        this.foxes = new ArrayList<>();
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void checkIfExists(String name) {
        if (foxes.contains(name)) {
            foxes.stream().findAny().equals(name);
        } else {
            foxes.add(new Fox(name));
        }

    }
}
