package io.codelex.examination_work.card;

class CreditCard extends Card {
    public CreditCard(String cardNumber, String owner, String ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() + amount > 10000) {
            System.out.println("Warning: Too much money");
        }
        balance += amount;
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() - amount < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance -= amount;
        if (getBalance() < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}
