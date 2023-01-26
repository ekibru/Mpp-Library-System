package Exam;

import java.util.List;

public class Country {
    private double population;
    private String name;
    private List<SportTeam> sport;

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SportTeam> getSport() {
        return sport;
    }

    public void setSport(List<SportTeam> sport) {
        this.sport = sport;
    }
}
