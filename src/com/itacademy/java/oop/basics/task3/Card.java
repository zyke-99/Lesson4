package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    protected double balance;
    private String cardHolderName;
    private String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public Card() {
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card credit(double amount) {
        this.balance+=amount;
        return this;
    }

    public abstract Card debit(double amount);


}
