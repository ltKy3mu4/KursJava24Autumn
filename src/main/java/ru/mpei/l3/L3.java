package ru.mpei.l3;

import ru.mpei.l2.Student;

public class L3 {
    public static void main(String[] args) {
        Student s2 = new Student();
        boolean adult = s2.isAdult();
        Student defualtStudent = Student.createDefualtStudent();
        double asin = Math.asin(0.5);

        Object a = new Object();
        String string = a.toString();
        Class<?> aClass = a.getClass();

        Class aClass1 = s2.getClass();

        int i = a.hashCode();
//        int i1 = s2.hashCode();

        System.out.println();
        Student student = new Student("Alex", "Ivanov", 23, true);
        Student student2 = new Student("Nikita", "Ivanov", 22, false);
        Student student3 = new Student("Alex", "Ivanov", 23, true);
        Student student4 = student;

        int h1 = student.hashCode();
        int h2 = student2.hashCode();
        System.out.println();

        double x = 1.0, y = 2.0;
        if (x == y) {
            System.out.println("true");
        }
        if (student == student4){
            System.out.println();
        } else {
            System.out.println("not equal");
        }

        if (student.equals(a)){
            System.out.println("FINALLY EQUAL!!!!");
        }

        if (student.equals(student3)){
            System.out.println("FINALLY EQUAL!!!!");
        }


        HumanNPC humanNPC = new HumanNPC();
        humanNPC.saySomething();

        MonsterNPC monsterNPC = new MonsterNPC();

        double[] doubles = DamageCalculation.calcNextHumanCoordinates(humanNPC);

        double[] doubles1 = DamageCalculation.calcNextHumanCoordinates(monsterNPC);

        Level l = new Level();
        l.addNpc(new MonsterNPC());
        l.addNpc(new HumanNPC());
        l.addNpc(new PlanNPC());

        move(monsterNPC);

        Movable m = new HumanNPC();

        Movable[] entyties = new Movable[20];
        entyties[0] = monsterNPC;
        entyties[1] = humanNPC;

        for (int ii =0; ii < entyties.length; ii++){
            entyties[ii].go(10);
        }
    }

    public static void move(Movable m){
        m.go(100);
    }
}
