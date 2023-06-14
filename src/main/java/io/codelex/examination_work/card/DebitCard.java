package io.codelex.examination_work.card;

class DebitCard extends Card {
    public DebitCard(String cardNumber, String owner, String ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() + amount > 10000) {
            throw new NotEnoughFundsException("Exceeded maximum balance");
        }
        balance += amount;
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (getBalance() - amount < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}

