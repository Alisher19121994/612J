package com.example.a612j;

import java.io.Serializable;

public class Users implements Serializable {

    String name;
    int age;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
