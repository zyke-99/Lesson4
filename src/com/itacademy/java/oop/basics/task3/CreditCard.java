package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exception.NotEnoughCreditException;

public class CreditCard extends Card{

    private double interest;
    private final double credit;

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }


    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public Card debit(double amount) {
        if(this.balance - amount < -(this.credit)) {
            throw new NotEnoughCreditException("Credit limit exceeded, cannot withdraw!");
        } else {
            this.balance -= amount;
            return this;
        }
    }
}
