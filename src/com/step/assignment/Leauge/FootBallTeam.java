package com.step.assignment.Leauge;

public class FootBallTeam extends Team{


    public FootBallTeam(String name, int won, int lost, int draw) {
        super(name, won, lost, draw);
    }

    @Override
    public int calculateTotal() {
        return super.getWon() - super.getLost();
    }
}
