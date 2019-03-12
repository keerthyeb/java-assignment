package com.step.assignment.Leauge;

public abstract class Team {
    private String name;
    private int won;
    private int lost;
    private int draw;

    public Team(String name, int won, int lost, int draw) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }

    public int CompareTeam(Team t1){
        int myTotal = this.calculateTotal();
        int t1Total = t1.calculateTotal();
        return myTotal-t1Total;
    }

    public int calculateTotal(){
        return this.won+this.draw;
    }
}
