package ru.mpei.l6;

import ru.mpei.l3.HumanNPC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HumanNPC npc = null;
        //...
        double speed;
        try {
            int a = 100 / 0;
            speed = npc.getSpeed();
        }catch (NullPointerException | ArithmeticException  e){
            e.printStackTrace();
            speed = 100;
        }

        System.out.println("hello");

        try {
            printFile("src/main/resources/data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        MpeiPrinter mpeiPrinter = new MpeiPrinter();
        for (int i = 0; i < 20; i++) {
            try {
                mpeiPrinter.print("hello");
            } catch (PaperAbsentException e) {
                e.printStackTrace();
                break;
            }
        }

//        double[] arr = new double[5];
//        double v = arr[6];

        mpeiPrinter = new MpeiPrinter();
        try {
            System.out.println("try starts");
            mpeiPrinter.print("dasdas");
            System.out.println("try ends");
        } catch (PaperAbsentException e) {
            System.out.println("catch start");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }

        try {
          mpeiPrinter.print("dsad");
        }catch (ArithmeticException e ){
            e.printStackTrace();
        } catch (MpeiDriverException e2){
            e2.printStackTrace();
        } catch (RuntimeException re){
            re.printStackTrace();
        }
    }

    public static void printFile(String path) throws IOException {
        List<String> strings = Files.readAllLines(Path.of(path));
        for (String string : strings) {
            System.err.println(string);
        }

    }
}
