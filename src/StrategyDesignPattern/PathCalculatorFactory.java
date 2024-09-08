package StrategyDesignPattern;

public class PathCalculatorFactory {
    private static CarPathCalculator carPathCalculator = CarPathCalculator.getInstance();
    private static BikePathCalculator bikePathCalculator = BikePathCalculator.getInstance();
    private static WalkPathCalculator walkPathCalculator = WalkPathCalculator.getInstance();


    public static PathCalculator getPathCalculator(Mode mode){
        return switch (mode){
            case CAR ->  carPathCalculator;
            case BIKE -> bikePathCalculator;
            case WALK -> walkPathCalculator;
            default -> null;
        };
    }
}
