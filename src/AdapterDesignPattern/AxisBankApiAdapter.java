package AdapterDesignPattern;

import AdapterDesignPattern.thirdParty.AxisBankApi;

//All the conversion and compatibility logic is here
public class AxisBankApiAdapter implements BankApi{

    private AxisBankApi axisBankApi;
    public AxisBankApiAdapter() {
        this.axisBankApi = new AxisBankApi();
    }
    @Override
    public double checkBalance(String upiId, int pin) {
        double balance = axisBankApi.getBalance(upiId,pin);
        return balance;
    }

    @Override
    public void addBankAccount(BankDetails details, int pin, int otp) throws Exception {
        axisBankApi.addNewAccount(details.getBankAccountId(), details.getDebitCardNumber(),otp,pin);
    }

    @Override
    public int transfer(String fromUpiId, String toUpiId, int pin, double amount) {
        char message = axisBankApi.transferPayment(fromUpiId,toUpiId,amount,pin);
        if(message=='Y')
            return 1;
        return 0;
    }
}
