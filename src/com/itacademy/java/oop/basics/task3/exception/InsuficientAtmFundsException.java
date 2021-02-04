package com.itacademy.java.oop.basics.task3.exception;

public class InsuficientAtmFundsException extends RuntimeException{
    public InsuficientAtmFundsException(String message) {
        super(message);
    }
}
