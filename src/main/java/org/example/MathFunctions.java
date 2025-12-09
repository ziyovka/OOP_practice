package org.example;

public class MathFunctions {

    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        if(b==0){
            return 0;
        } return  (a/b);
    }
    public double abs(double a,double b){
        return Math.abs(a)+Math.abs(b);

    }
    public double pow(double a,double b){
        return Math.pow(a,b);
    }
}
