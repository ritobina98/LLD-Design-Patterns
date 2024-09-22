package AdapterDesignPattern;

public class PhonePe {
    private BankApi bankApi;
    public  PhonePe(BankApi bankApi){
        this.bankApi=bankApi;
    }
    public double checkBalance(String upiId,int pin){
        return bankApi.checkBalance(upiId,pin);
    }
    // bankAPI will be used down the line
    // no code change will be needed here if you want to add new bank API adapters
}
