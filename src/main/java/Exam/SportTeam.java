package Exam;

import java.util.*;

public class SportTeam {
    private String nameOfSport;
    private int numberOfPlayers;
    private List<Athlete> athleteList;

    public SportTeam(String nameOfSport, int numberOfPlayers) {
        this.nameOfSport = nameOfSport;
        this.numberOfPlayers = numberOfPlayers;
        athleteList = new ArrayList<>();
    }

    public String getNameOfSport() {
        return nameOfSport;
    }

    public void setNameOfSport(String nameOfSport) {
        this.nameOfSport = nameOfSport;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public List<Athlete> getAthleteList() {
        return athleteList;
    }

    public void setAthleteList(List<Athlete> athleteList) {
        this.athleteList = athleteList;
    }
    public void addAthleteList(Athlete athl) {
        this.athleteList.add(athl);
    }
    public double highestSalary(){
        double high = 0.0;
        for(Athlete b : athleteList){
            if(b.getSalary()>high)
                high =b.getSalary();
        }
        return high;
    }
}
