package Exam;

public class BankAccount {
    private String accNumber;
    private double balance;
    private double intresetRate;

    public BankAccount(String accNumber, double balance, double intresetRate) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.intresetRate = intresetRate;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIntresetRate() {
        return intresetRate;
    }

    public void setIntresetRate(double intresetRate) {
        this.intresetRate = intresetRate;
    }
}
