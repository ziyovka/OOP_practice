package org.example;

public class Main {
    public static void main(String[] args){
Triangle t1=new Triangle(1,5,3);
Trapezium t2=new Trapezium(4,6,2,6);
Rectangle r3=new Rectangle(3,8);
        System.out.println(t1.area());
        System.out.println(t1.Perimetr());
        System.out.println(t2.area());
        System.out.println(t2.Perimetr());
        System.out.println(r3.area());
        System.out.println(r3.Perimetr());
        Dog d1=new Dog();
        d1.setName("Alex");
        d1.sound();
        Duck d2=new Duck();
        d2.setName("Scrudge");
        d2.sound();
        Cat c1=new Cat();
        c1.setName("Garfield");
        c1.sound();


   }
}
