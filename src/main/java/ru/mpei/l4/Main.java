package ru.mpei.l4;

import ru.mpei.l2.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = "dsadas";
//        System.out.println(array[1]);

//        String el = array[2];
//        el.startsWith("dsadas");

        String[] array2 = new String[20];

        for(int i =0; i < args.length; i++){
            array2[i] = array[i];
        }


        ArrayList container = new ArrayList();
        container.add("Mama");
        container.add("Papan");
        container.add("Son");


        //....
//        container.add(new Student());

        Iterator iterator = container.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            String a = (String) next;
            System.out.println(a.length());
        }

        List<String> strCntr = new ArrayList<>();
        strCntr.add("Mama");
        strCntr.add("Papan");
        strCntr.add("Son");

//        strCntr.add(new Student());

        Box hhh = Box.of("hhh");
        if (hhh.isEmpty()){
            System.err.println("cannot get data from box");
        } else {
            String s = hhh.get();
            System.out.println(s);
        }

        AbstractBox<Student> aBox = AbstractBox.of(new Student());
        Student student = aBox.get();


        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");

        a.remove("c");

        List<String> a2 = new LinkedList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");
        a2.add("d");

        a2.remove("c");
    }
}
