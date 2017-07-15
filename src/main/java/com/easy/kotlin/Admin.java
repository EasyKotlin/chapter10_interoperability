package com.easy.kotlin;

/**
 * Created by jack on 2017/7/14.
 */
public class Admin {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
            "name='" + name + '\'' +
            '}';
    }
}
