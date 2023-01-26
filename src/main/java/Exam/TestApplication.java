package Exam;

import java.util.ArrayList;
import java.util.*;

public class TestApplication {
    public static void main(String[] args) {


        SportTeam s = new SportTeam("Hocky",18);
        SportTeam t = new SportTeam("Ravens",20);
        SportTeam u = new SportTeam("BaseBall",12);
        SportTeam v = new SportTeam("Clevland",16);
        SportTeam w = new SportTeam("NYC",19);

        Athlete a = new Athlete("John",1000);
        Athlete b = new Athlete("Tim",1300);
        Athlete c = new Athlete("Billy",1400);
        Athlete d = new Athlete("Nhyyy",100);

        BankAccount e = new Savings("123",12000,.3);
        BankAccount f = new Savings("124",11000,.3);
        BankAccount g = new Savings("125",10000,.3);

        BankAccount h = new Retirement("126",9000,.3,"06-09");
        BankAccount m = new Retirement("125",10000,.3,"05-2");
        BankAccount n = new Retirement("126",9000,.3,"02-12");

        BankAccount em = new Checking("123",12000,.3);
        BankAccount fm = new Checking("124",11000,.3);
        BankAccount gm = new Checking("125",10000,.3);

        BankAccount hm = new Checking("126",9000,.3);
        BankAccount tm = new Savings("123",12000,.3);
        BankAccount km = new Checking("124",10000,.3);

        List<BankAccount> bank =Arrays.asList(e,h,em,hm);
        List<BankAccount> bank1 =Arrays.asList(f,m,fm,tm);
        List<BankAccount> bank2 =Arrays.asList(g,n,gm,km);



        List<Athlete> lm = Arrays.asList(a,b,c,d);

        for(Athlete nj :lm) {
            nj.setAcc(bank);
            nj.setAcc(bank1);
            nj.setAcc(bank2);
        }

        s.setAthleteList(lm);


        List<SportTeam> sp = Arrays.asList(s,t,u,v,w);
        for(SportTeam mjk : sp)
            mjk.setAthleteList(lm);

        double sum =0.0;
        for(SportTeam nm :sp)
            for(Athlete as:nm.getAthleteList())
                sum=as.highestSal();


        System.out.println(sum);


    }
}
