package org.bibib.labs.laba2;

import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) {

        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        double a = 10, b = 8, c = 1, y = 3.3;

        if (isValidInputValues(a, b, c)) {
            System.out.println(calculate(a, b, c, y, x));
        } else {
            throw new ArithmeticException("Error: Invalid input values. The expression under the square root is negative.");
        }

    }
    public static double calculate(double a, double b, double c, double y, double x) {
        return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5) )/(Math.sqrt(a - b - c));
    }

    public static boolean isValidInputValues(double a, double b, double c){
        return (a - b - c >= 0);
    }
}
