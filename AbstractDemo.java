package javaapplication4;

abstract class Shape {
    // Abstract method
    abstract void draw();
    void message() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.message();
        s1.draw();

        s2.message();
        s2.draw();
    }
}