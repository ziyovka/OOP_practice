package org.example;

public class Rectangle extends GeometricFigure {
     double a;
     double b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double Perimetr() {
        return (a+b)*2;
    }
}
