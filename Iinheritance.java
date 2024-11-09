package oop;

/**
 * Inheritance in Java is a key object-oriented programming concept that allows
 * a class (called a subclass or derived class) to inherit fields and methods
 * from another class (called a superclass or base class). This enables code
 * reusability, supports polymorphism, and establishes a hierarchical
 * relationship between classes.
 */
public class Iinheritance {

    public static void main(String[] args) {
        Toyota myCar = new Toyota("Toyota");
        myCar.start();
        myCar.display();
    }
}

class Vehicle {

    int maxSpeed = 120;
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    int maxSpeed = 180;

    public Car(String name) {
        super(name);
    }

    void display() {
        System.out.println("Max Speed: " + maxSpeed); // Subclass maxSpeed
        System.out.println("Vehicle Max Speed: " + super.maxSpeed); // Superclass maxSpeed
    }

    void start() {
        super.start();
        System.out.println("Car starts");
    }
}

/// Multilevel inheritance
class Toyota extends Car {

    public Toyota(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void start() {
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }

}
