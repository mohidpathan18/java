package javaapplication4;

interface MathOperations {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}
class Calculator implements MathOperations {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        MathOperations obj = new Calculator();
        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.subtract(10, 5));
        System.out.println("Multiplication: " + obj.multiply(10, 5));
        System.out.println("Division: " + obj.divide(10, 5));
    }
}