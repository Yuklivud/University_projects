/**
 * Пакет — це механізм організації класів і інтерфейсів у структуровані групи.
 * Пакети використовуються для уникнення конфліктів імен та для логічного групування пов'язаних класів.
 */
package org.bibib.labs.laba5.laba5_1;

/**         Клас - це шаблон або план, який визначає властивості (атрибути)
 *          і поведінку (методи) об'єктів, що будуть створені на його основі.
 */
public class Calculation {

    /**     Поля (атрибути) - це змінні, що зберігають стан об'єкта. */
    private double a, b, c, y;

    /**
     *      Статичний атрибут — це атрибут класу, який спільний для всіх об'єктів цього класу і належить класу, а
     *       не конкретному об'єкту. */

    private static final double N = 20;
    private final double startX = -10 - 2.5 * N;
    private final double endX = 5 + 1.2 * N;
    private final double step = 0.5 + N / 20;

    /**     Конструктор - це спеціальний метод, який викликається при створенні нового об'єкта класу. */
    public Calculation() {
        this.a = 15;
        this.b = 7;
        this.c = 3;
        this.y = 10;
    }

    public Calculation(double a, double b, double c, double y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.y = y;
    }

    /**     Методи класу - це функції, які визначають поведінку об'єкта. */

    public double calculate(double a, double b, double c, double y, double x) {
        return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5)) / (Math.sqrt(a - b - c));
    }

    public boolean isValidInputValues(double a, double b, double c) {
        return ((a - b - c >= 0) && ((b + c) < a) && (b > c));
    }

    /**     Перевантаження методів - це можливість створювати кілька методів
     *      з однаковим ім'ям у одному класі, але з різними параметрами
     */

    public void calculateByFor(double a, double b, double c, double y) {
        System.out.println("Using for loop:");
        for (double x = startX; x <= endX; x += step) {
            if (isValidInputValues(a, b, c)) {
                double result = calculate(a, b, c, y, x);
                System.out.printf("x = %.2f -> result = %.5f%n", x, result);
            } else {
                throw new ArithmeticException("Invalid input values.");
            }
        }
    }

    public void calculateByFor() {
        System.out.println("Using for loop:");
        for (double x = startX; x <= endX; x += step) {
            if (isValidInputValues(a, b, c)) {
                double result = calculate(a, b, c, y, x);
                System.out.printf("x = %.2f -> result = %.5f%n", x, result);
            } else {
                throw new ArithmeticException("Invalid input values.");
            }
        }
    }
    /**
     *      Статичний метод — це метод, який належить класу, а не його об'єктам. Його можна викликати без створення об'єкта,
     *      через ім'я класу: ClassName.methodName().
     * */

    public static double staticCalculate(double a, double b, double c, double y, double x) {
        if ((a - b - c >= 0) && ((b + c) < a) && (b > c)) {
            return (Math.pow(Math.tan(y), 3) + Math.pow((Math.sin(x * Math.sqrt(b - c))), 5)) / (Math.sqrt(a - b - c));
        } else {
            throw new ArithmeticException("Invalid input values. The expression under the square root is negative.");
        }
    }

    /**     Сетери та гетори - спеціальні методи які встановлюють та повертають значення полів (атрибутів).
     *
     *      Типізовані методи — це методи, які повертають значення певного типу, наприклад "double getA()".
     *      Безтипові методи (void) — це методи, які не повертають значення, наприклад "void setA()".
     *
     * */

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
