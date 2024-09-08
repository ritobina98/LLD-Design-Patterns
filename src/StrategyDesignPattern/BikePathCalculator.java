package StrategyDesignPattern;

public class BikePathCalculator implements PathCalculator{
    private static BikePathCalculator instance = null;
    private BikePathCalculator(){
    }
    public static BikePathCalculator getInstance(){
        if(instance == null){
            synchronized (BikePathCalculator.class){
                if(instance == null){
                    instance = new BikePathCalculator();
                }
            }
        }
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculated from "+source+" to "+destination+" via bike");
    }
}
