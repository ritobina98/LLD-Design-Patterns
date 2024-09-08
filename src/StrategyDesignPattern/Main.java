package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("Kolkata","Puri",Mode.CAR);
    }
}
