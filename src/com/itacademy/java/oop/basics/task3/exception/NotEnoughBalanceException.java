package com.itacademy.java.oop.basics.task3.exception;

public class NotEnoughBalanceException extends RuntimeException{
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
