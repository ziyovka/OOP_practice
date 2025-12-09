package org.example;

public class Duck extends Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name+" makes quack quack");
    }
}
