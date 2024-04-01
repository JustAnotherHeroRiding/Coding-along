package org.example;

import java.io.Serializable;

class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

class JavaBean implements Serializable {
    // no argument constructor
    public JavaBean() {
    }

    private String text;
    private int number;

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}

public class POJOvsBean {
}
