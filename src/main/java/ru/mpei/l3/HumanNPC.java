package ru.mpei.l3;

import java.util.Random;

public class HumanNPC extends NPC implements Movable{

    private String[] speech;

    public String[] getSpeech() {
        return speech;
    }

    public void setSpeech(String[] speech) {
        this.speech = speech;
    }

    @Override
    public String getName() {
        return "LOL";
    }

    public String saySomething(){
        Random r = new Random();
        int i = r.nextInt(speech.length);
        return super.getName() + " says: "+speech[i];
    }

    @Override
    public void go(double distance) {
        coordinates[0] = coordinates[0]+distance;
        coordinates[1] = coordinates[1] + distance;
    }
}
