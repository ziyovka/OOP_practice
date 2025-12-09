package org.example;

public class Trapezium extends GeometricFigure {
    double a;
    double b;
    double d;
    double high;
    Trapezium(double a,double b,double high,double d){
        this.a=a;
        this.b=b;
        this.high=high;
        this.d=d;
    }

    @Override
    public double area() {
        return (a+b)/2*high;
    }

    @Override
    public double Perimetr() {
        return a+b+high+d;
    }
}
