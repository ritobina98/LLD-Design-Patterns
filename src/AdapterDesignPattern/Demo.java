package AdapterDesignPattern;
import AdapterDesignPattern.AxisBankApiAdapter;
public class Demo {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankApiAdapter());
        phonePe = new PhonePe(new AxisBankApiAdapter());
        double bal = phonePe.checkBalance("hello@gpay,com",1234);
        System.out.println("balance is "+bal);
    }
}
