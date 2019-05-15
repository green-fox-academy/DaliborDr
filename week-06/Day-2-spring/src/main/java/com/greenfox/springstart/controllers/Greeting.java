package com.greenfox.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static AtomicLong atomicLong = new AtomicLong(1);

    public long getId() {
        return id;
    }

    long id;
    String content;


    public String getContent() {
        return content;
    }

    public Greeting(String content) {
        this.id = this.atomicLong.getAndIncrement();
        this.content = content;
    }
}
