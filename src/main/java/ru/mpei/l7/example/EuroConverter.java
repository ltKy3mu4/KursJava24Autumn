package ru.mpei.l7.example;

import ru.mpei.l7.anno.Component;

@Component(name = "euro")
public class EuroConverter implements Converter{

    public double toCurrency(double rub) {
        return rub * 105;
    }
}
