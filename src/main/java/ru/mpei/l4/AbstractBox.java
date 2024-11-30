package ru.mpei.l4;

import ru.mpei.l2.Student;

public class AbstractBox <Type> {

    private Type data;

    private AbstractBox(){}

    public static <Type> AbstractBox<Type> of (Type str){
        AbstractBox<Type> b = new AbstractBox<>();
        b.data = str;
        return b;
    }

    public static <Type> AbstractBox<Type> empty(){
        return new AbstractBox<>();
    }

    public boolean isEmpty(){
        return data == null;
    }

    public Type get(){
        return data;
    }
}
