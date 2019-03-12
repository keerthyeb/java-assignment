package com.step.assignment.Leauge;

public class CricketTeam extends Team {


    public CricketTeam(String name, int won, int lost, int draw) {
        super(name, won, lost, draw);
    }

    @Override
    public int calculateTotal() {
        return (super.getWon()) *2 + super.getDraw();
    }
}
