package oop;
/*
Abstraction in Java is an object-oriented programming concept that focuses on 
hiding complex implementation details and exposing only the necessary features of an object. 

    -It allows developers to focus on 'what' an object does rather than 'how' it does it. 
    -This is achieved in Java using abstract classes and interfaces.

*/
public class Abstraction {

    public static void main(String[] args) {
        Employee s = new Student(1000);
        s.calculateSalary(500);
        //-----------------------------------------
        Circle2 myCircle = new Circle2(5.0);
        Rectangle2 myRectangle = new Rectangle2(4.0, 6.0);
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}

//--------------example with abstract class named Employee
abstract class Employee {

    int workingHour, salary;

    public Employee(int workingHour) {
        this.workingHour = workingHour;
    }
    
    public void displaySalary() {
        System.out.println(salary);
    }

    abstract void calculateSalary(int paymentPerHour); // // Abstract method for calculateSalary
}

// Implement the abstract class in a class named Student
class Student extends Employee {

    public Student(int workingHour) {
        super(workingHour);
    }

    @Override
    void calculateSalary(int paymentPerHour) {
        salary = workingHour * paymentPerHour;
        super.displaySalary();
    }
}

//--------------example with interface named Shape2
interface Shape2 {
    
    double calculateArea();  // Abstract method for calculating the area
}

// Implement the interface in a class named Circle2
class Circle2 implements Shape2 {
    private double radius;

    public Circle2(double radius) { this.radius = radius; }

    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

// Implement the interface in a class named Rectangle2
class Rectangle2 implements Shape2 {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() { 
        return length * width; 
    }
}