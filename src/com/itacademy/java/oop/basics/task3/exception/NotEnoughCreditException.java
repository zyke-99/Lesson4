package com.itacademy.java.oop.basics.task3.exception;

public class NotEnoughCreditException extends RuntimeException{
    public NotEnoughCreditException(String message) {
        super(message);
    }
}
