package com.util.diegusweb.desingpatterns;

public class Baguette implements Bread{

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return " : 250 kcal";
    }
}
