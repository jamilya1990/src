package java_programming_classes.day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String type;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getType(){
        return type;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CheckingAccount capitalOne = new CheckingAccount();
        capitalOne.setAccountHolder("John Dough");
        capitalOne.setAccountNumber(0111222333L);
        capitalOne.setType("checking");
        capitalOne.setBalance(500000.900);
        System.out.println(capitalOne);
    }
}
