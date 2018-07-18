package com.util.diegusweb.desingpatterns;

public class Cheese implements Filling{

    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public String calories() {
        return " : 52 kcal";
    }
}

