package ru.mpei.l5;

public class Calculations {

    public static double sum(double s1, double s2){
        return s1 + s2;
    }

    public static long factorial(int n){
        long s = n;
        long currentN = n;
        for(int i =n-1; i > 0; i--){
            currentN = currentN - 1;
            s = s * currentN;
        }
        return s;
    }

    public static double sin(double degrees){
        return  4 * degrees * (180 - degrees) / (40500 - degrees * (180 - degrees));
    }

}
