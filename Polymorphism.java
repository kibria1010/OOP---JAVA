package oop;

/**
 * Polymorphism is an important concept in Java that allows objects to be treated as instances of their superclass, 
 * enabling multiple forms of behavior based on the object's actual type.
*/

public class Polymorphism {
    
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference to Animal object
        Animal myDog = new Dog();       // Animal reference to Dog object
        Animal myCat = new Cat();       // Animal reference to Cat object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows
        
        Shape myShape1 = new Circle();     // Shape reference to Circle
        Shape myShape2 = new Rectangle();  // Shape reference to Rectangle

        myShape1.draw(); // Output: Drawing a Circle
        myShape2.draw(); // Output: Drawing a Rectangle
        
        MathOperation m = new MathOperation();
        System.out.println(m.add(10, 20));
        System.out.println(m.add(10.5, 20.5));
    }
}

//-------------------Polymorphism with Method Overriding

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the sound method in Animal
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    // Overriding the sound method in Animal
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

//-------------------Polymorphism with Method Overloading

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

//-------------------Polymorphism with Interface

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}