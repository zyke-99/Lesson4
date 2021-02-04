package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exception.InsuficientAtmFundsException;
import com.itacademy.java.oop.basics.task3.exception.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.task3.exception.NotEnoughCreditException;

public class MyBankAtm implements Atm{

    private double balance;
    @Override
    public void withdraw(Card card, double amount) {

        if(amount > this.balance) {
            throw new InsuficientAtmFundsException("The ATM has insufficient funds, please try another one.");

        } else {
            try {
                card.debit(amount);
                System.out.println("Withdraw successful!");
            } catch (NotEnoughBalanceException m) {
                System.out.println(m);
            } catch (NotEnoughCreditException n) {
                System.out.println(n);
            }
        }

    }
}
