package org.example;

public class Dog extends Animal{
    String name;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name+" makes  bow bow");
    }
}
