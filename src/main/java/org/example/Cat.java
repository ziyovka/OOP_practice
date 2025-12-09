package org.example;

public class Cat extends Animal{
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name+" makes meow meow");
    }
}
