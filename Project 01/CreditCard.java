// Programmer : Jsako

public class CreditCard {
    
    private String name = null;
    private String accountNum = null;
    private String dueDate = null;
    private int rewardPoints = 0;
    private double balance = 0;
    
    public CreditCard() {
        
        name = "J. Sako";
        accountNum = "0000000000";
        dueDate = "03/09/2021";
        rewardPoints = 1;
        balance = 1000;
        
    }
    
    CreditCard(String newName, String newAccount, double newBalance) {
        
        name = newName;
        accountNum = newAccount;
        balance = newBalance;
        
    }
    
    String getName() {
        
        return name;
        
    }
    
    void setName(String Username) {
        
        name = Username;
        
    }
    
    String getAccount() {
        
        return accountNum;
        
    }
    
    void setAccount(String Account) {
        
        accountNum = Account;
        
    }
    
    String getDate() {
        
        return dueDate;
        
    }
    
    void setDate(String Userdate) {
        
        dueDate = Userdate;
        
    }
    
    int getPoints() {
        
        return rewardPoints;
        
    }
    
    void setPoints(int Userpoints) {
        
        rewardPoints = Userpoints;
        
    }
    
    double getBalance() {
        
        return balance;
        
    }
    
    void setName(double Userbalance) {
        
        balance = Userbalance;
        
    }
    
    double creditCharge(double charge) {
        
        return this.balance + charge;
        
    }
    
    double cashAdvance(double advance) {
        
        return this.balance + advance;
        
    }
    
    double creditPayment(double payment) {
        
        return cashAdvance(payment);
        
    }
    
    double accountInterest(double rate) {
        
        balance = (this.balance*rate) + balance;
        return balance;
        
    }
    
    public String toString() {
        
        return "Account Info : \n Name : " + name + "\n Account Number : " + 
                accountNum + "\n Balance : " + balance;
        
    }
    
}
