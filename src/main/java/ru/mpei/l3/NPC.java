package ru.mpei.l3;

public class NPC {
    protected String name;
    protected double healthBar;
    protected boolean isEnemy;
    protected double speed;
    protected double[] coordinates;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(double healthBar) {
        this.healthBar = healthBar;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
