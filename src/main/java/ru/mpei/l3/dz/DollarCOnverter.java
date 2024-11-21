package ru.mpei.l3.dz;

public class DollarCOnverter implements Converter{
    @Override
    public double convertToRub(double ue) {
        return 0;
    }

    @Override
    public Type getType() {
        return Type.Dollar;
    }
}
