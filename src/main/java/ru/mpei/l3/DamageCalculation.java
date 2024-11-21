package ru.mpei.l3;

public class DamageCalculation {

//    public static double[] calcNextHumanCoordinates(HumanNPC npc){
//        double[] coordinates = npc.getCoordinates();
//        double x = coordinates[0];
//        double y = coordinates[1];
//        double newX = x + npc.getSpeed() * 0.1;
//        double newY = y + npc.getSpeed() * 0.1;
//        return new double[] {newX, newY};
//    }
//
//    public static double[] calcNextMonsterCoordinates(MonsterNPC npc){
//        double[] coordinates = npc.getCoordinates();
//        double x = coordinates[0];
//        double y = coordinates[1];
//        double newX = x + npc.getSpeed() * 0.1;
//        double newY = y + npc.getSpeed() * 0.1;
//        return new double[] {newX, newY};
//    }
//
//    public static double[] calcNextPlanCoordinates(PlanNPC npc){
//        double[] coordinates = npc.getCoordinates();
//        double x = coordinates[0];
//        double y = coordinates[1];
//        double newX = x + npc.getSpeed() * 0.1;
//        double newY = y + npc.getSpeed() * 0.1;
//        return new double[] {newX, newY};
//    }


    public static double[] calcNextHumanCoordinates(NPC npc){
        double[] coordinates = npc.getCoordinates();
        double x = coordinates[0];
        double y = coordinates[1];
        double newX = x + npc.getSpeed() * 0.1;
        double newY = y + npc.getSpeed() * 0.1;
        return new double[] {newX, newY};
    }
}
