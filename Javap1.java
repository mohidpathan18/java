// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Javap1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}