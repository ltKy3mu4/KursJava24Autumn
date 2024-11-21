package ru.mpei.l3;

public class PlanNPC extends NPC implements Movable{
    private double high;


    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public void go(double distance) {
        return;
    }
}
