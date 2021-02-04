package com.itacademy.java.oop.basics.task2;

import com.itacademy.java.oop.basics.task2.exception.BrakesException;
import com.itacademy.java.oop.basics.task2.exception.GearException;
import com.itacademy.java.oop.basics.task2.exception.SpeedException;

public class RoadBike implements Bicycle {

    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public RoadBike() {
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void changeGear(int newGear) {
        if (Math.abs(this.gear - newGear) <= 2) {
            if (newGear < 0 || newGear > 10) {
                throw new GearException("Road bike gear can only be in between 0 and 10, could not change gear");
            } else {
                this.gear = newGear;
                System.out.println("Road bike new gear: " + this.gear);
            }
        } else {
            throw new GearException("The difference between road bike gears cannot exceed 2, could not change gear");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            throw new SpeedException("Road bike speed increment cannot be a negative number");
        } else {
            if (this.speed + increment > 50) {
                throw new SpeedException("Road bike speed cannot exceed 50, maximum possible increment value could be: " + (50-this.speed));
            } else {
                this.speed += increment;
                System.out.println("New road bike speed: " + this.speed);
            }
        }

    }

    @Override
    public void applyBrakes() {
        if (this.speed > 0) {
            this.speed--;
            System.out.println("New road bike speed: " + this.speed);
        } else {
            throw new BrakesException("Road bike lowest possible speed is reached, cannot apply brakes");
        }
    }
}
