package org.example;

public class MathFunctions {

    // Static variables
    public static double pi;
    public static double e;

    // Constructor (initialize pi and e when starting class)
    public MathFunctions(double piValue, double eValue) {
        pi = piValue;
        e = eValue;
    }

    // 1) Doira yuzi: S = π * r^2
    public double calcCircleArea(double radius) {
        return pi * radius * radius;
    }

    // 2) e^a hisoblash
    public double calcEPower(double a) {
        return Math.pow(e, a);
    }

    // 3) Uchburchak yuzi (Geron formulasi)
    public double calcTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;  // yarim perimetr
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
