package StrategyDesignPattern;

public class GoogleMaps {
    public void findPath(String source, String destination, Mode mode){
        PathCalculator pathCalculator=PathCalculatorFactory.getPathCalculator(mode);
        assert pathCalculator != null;
        pathCalculator.findPath(source,destination);
    }
}
