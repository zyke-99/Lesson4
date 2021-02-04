package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exception.NotEnoughBalanceException;

public class DebitCard extends Card{

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    public DebitCard() {
    }

    @Override
    public Card debit(double amount) {
        if(this.getBalance() - amount < 0) {
            throw new NotEnoughBalanceException("Not enough balance in debit card, cannot withdraw!");
        }
        else {
            this.balance -= amount;
            return this;
        }
    }
}
