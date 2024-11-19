package ru.mpei.l2;

import java.util.Arrays;

public class L2Main {


    public static void main(String[] args) {
        double a1 = 20;
        double a2 = 10;
        double a3 = 30;

        double[] arrayOfDouble = {10, 20, 30};

        System.out.println(arrayOfDouble[1]);

        double sum = arrayOfDouble[0] + arrayOfDouble [1] + arrayOfDouble[2];

        int length = arrayOfDouble.length;
        System.out.println();

        double[] arr2 = new double[10];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;


//        System.out.println(arr2[0]);

//        arr2[10] = 20;

//        double sum = arr2[0] + arr2[1] + arr2[2]...;
        int i = 0;
        while (i < 10){
//            System.out.println(arr2[i]);
            arr2[i] = i * 10;
            i = i + 1;
        }

        for (int j =0; j < 10; j++){
            if (arr2[j] == 30){
                continue;
            }
            System.out.println(arr2[j]);
//            if(arr2[j] >= 50){
//                break;
//            }
//            System.err.println("end");
        }
//        j++ == j = j + 1;
        String name = "Hello world!";
//        String name2 = new String("Hello world");
        System.out.println(name);
        System.out.println(name.length());
        boolean d = name.startsWith("Hell");
        System.out.println();

//        Student student = new Student();
//        student.name = "Alex";
//        student.surname = "Ivanov";
////        student.age = 23;
//        student.setAge(-1000);
//        student.presentInLesson = true;
//
//        Student student2 = new Student();
//        student2.name = "Nikita";
//        student2.surname = "Petrov";
//        student2.setAge(21);
////        student2.age = -1000;
//        student2.presentInLesson = false;

        Student student = new Student("Alex", "Ivanov", 23, true);
        Student student2 = new Student("Nikita", "Ivanov", 30, true);

        Student copy = new Student(student);

        System.out.println(student);
        System.out.println(student2.printInfo());
        System.out.println(copy.printInfo());
    }
}
