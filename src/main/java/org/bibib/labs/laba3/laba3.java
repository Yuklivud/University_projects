package org.bibib.labs.laba3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class laba3 {
    public static void main(String[] args) {

        System.out.println("Enter x: ");
        try(Scanner sc = new Scanner(System.in)){
            double x = sc.nextDouble();

            double a = 10, b = 4, c = 3, y = 3.3;

            if (isValidInputValues(a, b, c)) {
                System.out.println(calculate(a, b, c, y, x));
            } else {
                throw new ArithmeticException("Error: Invalid input values. The expression under the square root is negative.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please, enter a valid number.");
        }
    }

    public static double calculate(double a, double b, double c, double y, double x) {
        return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5) )/(Math.sqrt(a - b - c));
    }

    public static boolean isValidInputValues(double a, double b, double c){
        return ((a - b - c >= 0) && ((b+c) < a));
    }
}
