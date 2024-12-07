package ru.mpei.l7.example;

import ru.mpei.l7.anno.ComponentAnnotationProcessor;

import java.util.ArrayList;
import java.util.List;

public class Exchanger {
    private List<Converter> converters = ComponentAnnotationProcessor.process();

    public double convert(double rub){
        for (Converter converter : converters) {
            converter.toCurrency(rub);
        }
        return 0.0;
    }
}
