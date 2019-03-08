package com.step.assignment;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(0,0);
    }

    public double distance(int x, int y){
        double product = (double) (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y);
        return Math.pow(product, .5D);
    }

    public double distance(Point point){
        return this.distance(point.x, point.y);
    }
}
