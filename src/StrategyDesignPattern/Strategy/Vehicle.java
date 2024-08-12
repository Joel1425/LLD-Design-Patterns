package StrategyDesignPattern.Strategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // this is a constructor injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }
}
