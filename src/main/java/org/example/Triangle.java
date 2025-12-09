package org.example;

public class Triangle extends GeometricFigure{
    double a;
    double b;
    double c;
    Triangle(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double area(){
        return 0.5*a*b;
    }

    @Override
    public double Perimetr() {
        return a+b+c;
    }
}
