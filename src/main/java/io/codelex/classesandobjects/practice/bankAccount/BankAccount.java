package io.codelex.classesandobjects.practice.bankAccount;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        String balanceString;
        if (balance < 0) {
            balanceString = "-$" + String.format("%.2f", -balance);
        } else {
            balanceString = "$" + String.format("%.2f", balance);
        }
        return name + ", " + balanceString;
    }
}

