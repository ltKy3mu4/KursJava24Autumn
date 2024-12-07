package ru.mpei.l6;

public class MpeiPrinter {
    private int pageCounter = 10;

    public void print(String s) throws PaperAbsentException{
        if (pageCounter > 0){
            pageCounter--;
            System.err.println(s);
        } else {
            throw new PaperAbsentException();
        }
    }

}
