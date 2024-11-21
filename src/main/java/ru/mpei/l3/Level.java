package ru.mpei.l3;

public class Level {

//    private HumanNPC[] humanNPCS;
//    private MonsterNPC[] monsterNPCS;
//    private PlanNPC[] planNPCS;

    private NPC[] npcs = new NPC[100];
    private int index = 0;

    public void addNpc(NPC npc){
        npcs[index] = npc;
        index++;
    }
}
