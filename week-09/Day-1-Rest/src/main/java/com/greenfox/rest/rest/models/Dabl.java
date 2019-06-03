package com.greenfox.rest.rest.models;

public class Dabl {
    private Integer received;
    private Integer result;

    public Dabl() {

    }

    public Dabl(Integer received) {
        this.received = received;
        this.result = received * 2;
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
