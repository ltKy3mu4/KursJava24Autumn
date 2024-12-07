package ru.mpei.l7.example;

import ru.mpei.l7.anno.Component;

@Component(name = "dollar")
public class DollarConverter implements Converter{

    @Override
    public double toCurrency(double rub) {
        return rub * 100;
    }
}
