package org.bibib.labs.laba4;

public class laba4 {
    public static void main(String[] args) {
        try {
            double a = 15, b = 4, c = 3, y = 3.3;
            double N = 20;
            double startX = -10 - 2.5 * N;
            double endX = 5 + 1.2 * N;
            double step = 0.5 + N / 20;

            calculateByFor(startX, endX, step, a, b, c, y);
            calculateByWhile(startX, endX, step, a, b, c, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


    public static boolean isValidInputValues(double a, double b, double c) {
        return ((a - b - c >= 0) && ((b + c) < a));
    }

    public static double calculate(double a, double b, double c, double y, double x) {
        return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5)) / (Math.sqrt(a - b - c));
    }

    public static void calculateByFor(double startX, double endX, double step, double a, double b, double c, double y) {
        System.out.println("Using for loop:");
        for (double x = startX; x <= endX; x += step) {
            if (isValidInputValues(a, b, c)) {
                double result = calculate(a, b, c, y, x);
                System.out.printf("x = %.2f -> result = %.5f%n", x, result);
            } else {
                System.out.printf("x = %.2f -> Invalid input values.%n", x);
            }
        }
    }

    public static void calculateByWhile(double startX, double endX, double step, double a, double b, double c, double y) {
        System.out.println("\nUsing while loop:");
        double x = startX;
        while (x <= endX) {
            if (isValidInputValues(a, b, c)) {
                double result = calculate(a, b, c, y, x);
                System.out.printf("x = %.2f -> result = %.5f%n", x, result);
            } else {
                System.out.printf("x = %.2f -> Invalid input values.%n", x);
            }
            x += step;
        }
    }

}