package com.example.exam.exampleexam.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class WebSite {

    @Id
    @GeneratedValue
    private long id;

    private String url;
    private String alias;
    private int hitCount;

    @JsonIgnore
    private String secretCode;

    public WebSite() {

    }

    public WebSite(String url, String alias) {
        this.url = url;
        this.alias = alias;
        Random random = new Random();
        this.secretCode = String.format("%04d", random.nextInt(10000));
    }

    public void incrementHitCount() {
        this.hitCount++;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
