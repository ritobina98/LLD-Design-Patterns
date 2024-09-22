package AdapterDesignPattern.thirdParty;

public class AxisBankApi {

    public double getBalance(String upiId, int pin){
        return 145.87;
    }

    public void addNewAccount(String bankAccountNumber, String debitCard, int otp, int pin){

    }

    public char transferPayment(String fromUpiId, String toUpiId, double amount, int pin){
        return 'Y';
    }
}
