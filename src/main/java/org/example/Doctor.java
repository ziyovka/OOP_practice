package org.example;

public class Doctor {
     String name;
     int age;

    Doctor(String name, int age){
        this.age=age;
        this.name=name;

    }
    public void intro(){
        System.out.println("Hello my name is "+ name+" and I`m +"+age+" years old");
    }
}
