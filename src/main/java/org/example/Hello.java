package org.example;

public class Hello {

    String message;

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        return message;

    }
}

