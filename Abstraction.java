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
        s.calculateSalary(100);
    }
}

abstract class Employee {

    int workingHour, salary;

    public Employee(int workingHour) {
        this.workingHour = workingHour;
    }
    
    public void displaySalary() {
        System.out.println(salary);
    }

    abstract void calculateSalary(int paymentPerHour);
}

class Student extends Employee {

    public Student(int workingHour) {
        super(workingHour);
    }

    void calculateSalary(int paymentPerHour) {
        salary = workingHour * paymentPerHour;
        super.displaySalary();
    }

}
