package StrategyDesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
    }
}
