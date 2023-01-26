package Exam;

import java.util.List;

public class Athlete {
    private String name;
    private int age;
    private double salary;
    private List<BankAccount> acc;

    public Athlete(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<BankAccount> getAcc() {
        return acc;
    }

    public void setAcc(List<BankAccount> acc) {
        this.acc = acc;
    }
    public double highestSal(){
        double total =Double.MIN_VALUE;
        for(BankAccount ba : acc)
            if(ba.getBalance()>total)
                total= ba.getBalance();

        return total;
    }
}
