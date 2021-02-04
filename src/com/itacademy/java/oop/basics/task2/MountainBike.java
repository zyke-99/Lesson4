package com.itacademy.java.oop.basics.task2;

import com.itacademy.java.oop.basics.task2.exception.BrakesException;
import com.itacademy.java.oop.basics.task2.exception.GearException;
import com.itacademy.java.oop.basics.task2.exception.SpeedException;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public MountainBike() {
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void changeGear(int newGear){

        if (Math.abs(this.gear - newGear) <= 1) {

            if (newGear > 20 || newGear < 0) {
                throw new GearException("Mountain bike gear can only be in between 0 and 20");
            } else {
                this.gear = newGear;
                System.out.println("New mountain bike gear: " + this.gear);
            }

        } else {
            throw new GearException("Mountain bike difference between gear changes cannot be more than 1");
        }

    }

    @Override
    public void speedUp(int increment) {

        if (increment < 0) {
            throw new SpeedException("Mountain bike speed increment cannot be a negative number");
        } else {
            if (this.speed + increment > 100) {
                throw new SpeedException("Mountain bike speed would be exceeded, maximum increment value could be: " + (100-this.speed));
            } else {
                this.speed += increment;
                System.out.println("New mountain bike speed: " + this.speed);
            }
        }
    }

    @Override
    public void applyBrakes() {
        if (this.speed > -10) {
            this.speed--;
            System.out.println("New mountain bike speed: " + this.speed);
        } else {
            throw new BrakesException("Mountain bike cannot apply brakes anymore, lowest backwards speed is reached");
        }
    }
}
