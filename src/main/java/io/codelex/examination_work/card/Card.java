package io.codelex.examination_work.card;

abstract class Card {
    private String cardNumber;
    private String owner;
    private String ccv;
    protected double balance;

    public Card(String cardNumber, String owner, String ccv, double balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public abstract void addMoney(double amount) throws NotEnoughFundsException;

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getCcv() {
        return ccv;
    }

    public double getBalance() {
        return balance;
    }
}

