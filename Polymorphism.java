package oop;

/**
 * Polymorphism is an important concept in Java that allows objects to be
 * treated as instances of their superclass, enabling multiple forms of behavior
 * based on the object's actual type.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference to Animal object
        Animal myDog = new Dog();       // Animal reference to Dog object
        Animal myCat = new Cat();       // Animal reference to Cat object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows
    }
}

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
