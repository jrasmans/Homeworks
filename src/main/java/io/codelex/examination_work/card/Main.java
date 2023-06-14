package io.codelex.examination_work.card;

public class Main {
    public static void main(String[] args) {
        try {
            CreditCard creditCard = new CreditCard("123456789", "John Smith", "123", 500.0);

            creditCard.addMoney(1000.0);
            System.out.println("Credit Card Balance: " + creditCard.getBalance()); // Output: 1500.0

            creditCard.takeMoney(800.0);
            System.out.println("Credit Card Balance: " + creditCard.getBalance()); // Output: 700.0

            creditCard.takeMoney(1000.0); // Throws NotEnoughFundsException
        } catch (NotEnoughFundsException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Output: Insufficient funds
        }

        try {
            // Create a DebitCard instance
            DebitCard debitCard = new DebitCard("987654321", "Jane Smith", "456", 5000.0);

            // Add money to the debit card
            debitCard.addMoney(2000.0);
            System.out.println("Debit Card Balance: " + debitCard.getBalance()); // Output: 7000.0

            // Take money from the debit card
            debitCard.takeMoney(4000.0);
            System.out.println("Debit Card Balance: " + debitCard.getBalance()); // Output: 3000.0

            // Add money to the debit card (exceed maximum balance)
            debitCard.addMoney(8000.0); // Throws NotEnoughFundsException

        } catch (NotEnoughFundsException e) {
            System.out.println("Exception caught: " + e.getMessage()); // Output: Exceeded maximum balance
        }
    }
}
