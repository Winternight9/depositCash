package th.ac.ku;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Agent {


//    Condition 1
    public boolean checkDepositPerTime(float depositCash) {
        if (depositCash <= maximumDepositCashPerTime()) {
            return true;
        }
        else {
            return false;
        }
    }

    private int maximumDepositCashPerTime() {
        return 30000;
    }

//    Condition 2
    public boolean checkMaximumDepositPerDay(float depositCash) {
        if (depositCash <= maximumDepositCashPerDay()){
            return true;
        }
        else {
            return false;
        }
    }
    private int maximumDepositCashPerDay() {
        return 50000;
    }

//    Condition 3
    public boolean checkValidAccount(String accountNumber) {
        if(getAccountList().contains(accountNumber) && !getInvalidAccountList().contains(accountNumber)){
            return true;
        }
        else{
            return false;
        }
    }
    private List<String> getAccountList(){
        List<String> accountList = Arrays.asList("1234567890","2345678901","3456789012");
        return accountList;
    }
    private List<String> getInvalidAccountList(){
        List<String> inValidAccountList = Arrays.asList("1234567890","2345678901");
        return inValidAccountList;
    }

//    Condition 4
    public boolean checkMinimumDepositPerTime(float depositCash ,String bankAccountType) {
        if(getBankAccountType().get("Type1") <= depositCash){
            return true;
        }
        else {
            return false;
        }
    }

    private Dictionary<String,Integer> getBankAccountType(){
        Hashtable<String,Integer> bankAccountType = new Hashtable<String,Integer>();
        bankAccountType.put("Type1", 100);
        bankAccountType.put("Type2", 200);
        return bankAccountType;
    }
}
