package ru.mpei.l4;

public class Box {

    private String data;

    private Box(){}

    public static Box of (String str){
        Box b = new Box();
        b.data = str;
        return b;
    }

    public static Box empty(){
        return new Box();
    }

    public boolean isEmpty(){
        return data == null && data.isEmpty();
    }

    public String get(){
        return data;
    }
}
