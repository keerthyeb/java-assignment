package com.step.assignment.MasterChallengeExercise;

public class HamBurger {
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double totalPrice;
    private boolean hasCarrot;
    private boolean hasTomato;
    private boolean hasLettuce;

    public HamBurger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.totalPrice = basePrice;
    }

    public void addTomato(){
        this.hasTomato = true;
        this.totalPrice  += 20;
    }

    public void addCarrot(){
        this.hasCarrot = true;
        this.totalPrice  += 30;
    }

    public void addLettuce(){
        this.hasLettuce = true;
        this.totalPrice  += 40;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
