package AdapterDesignPattern;

public interface BankApi {
    //methods that we need
    double checkBalance(String upiId, int pin);
    void addBankAccount(BankDetails details, int pin, int otp) throws Exception;
    int transfer(String fromUpiId, String toUpiId, int pin, double amount);
}
