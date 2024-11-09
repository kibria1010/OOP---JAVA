package oop;

/*
Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
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

/*
Inheritance in Java is a key object-oriented programming concept that allows
a class (called a subclass or derived class) to inherit fields and methods
from another class (called a superclass or base class). 
This enables code reusability, supports polymorphism, and establishes a hierarchical relationship between classes.

Types of Inheritance:
    Java supports the following types of inheritance:
    Single inheritance: A class can inherit from only one superclass. Java does not support multiple inheritance with classes, to avoid ambiguity.
    Multilevel inheritance: A chain of inheritance where a class is derived from another derived class.
    Note:

super Keyword:
    The super keyword allows access to the superclass's methods and constructors from the subclass. It's often used to:
    Invoke the superclass's constructor is must at first line.
    Call methods from the superclass that are overridden in the subclass.

Method Overriding:
    When a subclass defines a method with the same signature as a method in its superclass, it "overrides" the superclass method. This allows the subclass to provide specific behavior for that method.

Access Modifiers
    Public members are accessible in all classes.
    Protected members are accessible in subclasses and within the same package.
    Default (no modifier) members are accessible within the same package only.
    Private members are not accessible in the subclass directly but can be accessed through public or protected getters/setters if provided.

Advantages of Inheritance
    Code Reusability: Shared code can be placed in a superclass and reused by subclasses.
    Polymorphism: Allows treating instances of different subclasses as instances of a superclass, making code more flexible.
    Extensibility: New functionalities can be added by creating subclasses without modifying existing code.

Key Rules
    -Java does not support multiple inheritance with classes to avoid complexity and ambiguity.
    -Constructors are not inherited but can be accessed with super.
    -Private members are not directly accessible by subclasses.
*/