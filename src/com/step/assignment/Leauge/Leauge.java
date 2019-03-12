package com.step.assignment.Leauge;

import java.util.Comparator;
import java.util.List;

public class Leauge<T extends Team> {
    private String name;
    private List<T> teams;

    public Leauge(String name, List<T> teams) {
        this.name = name;
        this.teams = teams;
    }

    public void printTeam() {
        this.sort();
        for (T team : teams) {
            System.out.println(team.getName());
        }
    }

    public void sort() {
        teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return o2.CompareTeam(o1);
            }
        });

    }

}
