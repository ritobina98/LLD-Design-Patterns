package SingletonDesignPattern;
//with thread safety
public class SingletonAdv {
    private SingletonAdv(){

    }
    private static SingletonAdv instance;

    public static SingletonAdv getInstance(){
        if(instance==null){
            synchronized (SingletonAdv.class) {
                if (instance == null)
                    instance = new SingletonAdv();
            }
        }
        return instance;
    }
}
