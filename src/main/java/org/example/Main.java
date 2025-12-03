package org.example;

public class Main {
    public static void main(String[] args){

        // initialize class with pi and e values
        MathFunctions mf = new MathFunctions(
                3.14159265359,
                2.71828182846
        );

        // Test
        System.out.println("Doira yuzi (r=5): " + mf.calcCircleArea(5));
        System.out.println("e^3: " + mf.calcEPower(3));
        System.out.println("Uchburchak yuzi (3,4,5): " + mf.calcTriangleArea(3, 4, 5));
   }
}
