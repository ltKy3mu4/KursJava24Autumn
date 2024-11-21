package ru.mpei.l3;

public class MonsterNPC extends NPC implements Movable{
    private double attackRange;

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    @Override
    public void go(double distance) {
        coordinates[0] = coordinates[0]+ 2* distance;
        coordinates[1] = coordinates[1] + 2* distance;
    }
}
