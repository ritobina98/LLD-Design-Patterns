package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        SingletonAdv obj1 = SingletonAdv.getInstance();
        System.out.println(obj1);
        SingletonAdv obj2 = SingletonAdv.getInstance();
        System.out.println(obj2);
        SingletonAdv obj3 = SingletonAdv.getInstance();
        System.out.println(obj3);
    }
}
