package ru.mpei.l1;

public class L1Main {

    public static void main(String[] args) {
        boolean myFirstVar = false;
        System.out.println(myFirstVar);
        myFirstVar = true;
        System.out.println(myFirstVar);

        byte myFirstByte = 15;
        byte mySecondByte = 120;

        byte sum =  (byte) (myFirstByte + mySecondByte);

        short sh1 = (short) 40_000;

        int int1  = 100;
        int int2 = 200;

        int sumInt = int1+ int2;

        long l1 = 1_000_000_000_000L;

        double myDouble1 = 2.05;
        double myDouble2 = 13.07;

        double dRes = myDouble1 + myDouble2;

        char aChar = '\n';
        char aChar2 = 97;


        int b = 50, n =20;
        System.out.println(b);

        double bb = 50.0;
        double re =  bb / n;

        int y = 10;
        double x = y;

        float yy = 10.0f;
        int xx = (int) yy;

        System.out.println(re);

        boolean a1 = true;
        boolean a2 = false;

        boolean resA = a1 && a2;
        boolean resB = a1 || a2;

        boolean resC = a1 == a2;

        boolean resInt = y == xx;

        resC = y != xx;

        int j = 10;
        if (j > 20 && resB){
            System.out.println("its error");
        } else if (j < 6){
            System.out.println("unexpected");
        } else {
            System.out.println("success");
        }

    }

}
