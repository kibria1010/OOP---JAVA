package oop;

/**
 * Encapsulation is a way to restrict the direct access to some components of an
 * object, so users cannot access state values for all of the variables of a
 * particular object. Encapsulation can be used to hide both data members and
 * data functions or methods associated with an instantiated class or object.
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
    // Private fields
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter and Setter methods
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
