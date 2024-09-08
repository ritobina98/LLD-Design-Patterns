package StrategyDesignPattern;

public class CarPathCalculator implements PathCalculator{
    private static CarPathCalculator instance=null;
    private CarPathCalculator(){
    }

    public static CarPathCalculator getInstance(){
        if(instance==null){
            synchronized (CarPathCalculator.class){
                if(instance==null){
                    instance=new CarPathCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculated from "+source+" to "+destination+" via car");
    }
}
