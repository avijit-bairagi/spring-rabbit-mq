package com.bbl.rabbitmq.model;

import java.io.Serializable;

public class MqMessageBody implements Serializable {

    private String id;

    private String message;

    public MqMessageBody() {
    }

    public MqMessageBody(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
