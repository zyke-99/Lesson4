package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("Mountain"), ROAD("Road");

    private String displayValue;

    Bike(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public static Bike fromCode(String code) {
        for (Bike b : values()) {
            if (b.getDisplayValue().equals(code)) {
                return b;
            }
        }
        throw new IllegalArgumentException("No such bike!");
    }


}
