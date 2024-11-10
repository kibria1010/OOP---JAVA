package oop;

/*
Encapsulation is a way to restrict the direct access to some components of an object, 
so users cannot access state values for all of the variables of a particular object.

    -Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit called a class.
    -It restricts direct access to certain details of an object, hiding its internal structure from the outside world.
    -Access to the data is provided through public methods, known as "getters" and "setters."
    -This helps to protect the integrity of the data and enables modular, maintainable code.
*/

public class Encapsulation {

    public static void main(String[] args) {
        BankAccount k = new BankAccount("01", 500);
        k.deposit(1000);
        System.out.println(k.getAccountNumber() +": "+ k.getBalance());
        k.withdraw(500);
        System.out.println(k.getAccountNumber() +": "+ k.getBalance());
    }
}

class BankAccount {
    // Private fields are going to be restricted to direct access from all other classes
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Providing public interface to manipulate restricted fields by 'Getter and Setter' methods.
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
