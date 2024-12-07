package ru.mpei.l7;

import ru.mpei.l7.annoexamples.HumanNpc;
import ru.mpei.l7.example.Exchanger;

public class Main {
    public static void main(String[] args) {

        HumanNpc n = new HumanNpc("alex", 100, 20, 30, new float[][]{{20.4f, 12.2f}, {2f,3f}});
        HumanNpc n2 = new HumanNpc();
        System.out.println(n);
//        n.getDamage();
//        n.setDamage();
//        n.getName();
//        n.setName();
        Exchanger e = new Exchanger();
        e.convert(100);
    }
}
