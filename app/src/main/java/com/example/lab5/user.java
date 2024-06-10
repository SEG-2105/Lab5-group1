package com.example.lab5;

import java.io.Serializable;

public class user implements Serializable {

    private String name;
    private String value;

    public user(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
