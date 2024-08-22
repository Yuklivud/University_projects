package org.bibib.labs.laba1;

import java.util.Scanner;

public class laba1 {
    public static void main(String[] args) {

        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        System.out.println(calculate(10, 7, 2, 3.3, x));
    }
    public static double calculate(double a, double b, double c, double y, double x) {
        return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5) )/(Math.sqrt(a - b - c));
    }
}
