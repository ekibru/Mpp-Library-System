package Exam;

public class Retirement extends BankAccount{
    private String date;

    public Retirement(String accNumber, double balance, double intresetRate,String date) {
        super(accNumber, balance, intresetRate);
        this.date = date;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
