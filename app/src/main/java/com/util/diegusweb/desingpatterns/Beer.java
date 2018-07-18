package com.util.diegusweb.desingpatterns;

public class Beer implements Drink{

    @Override
    public String name() {
        return "Cerveza";
    }

    @Override
    public String calories() {
        return " : 155 kcal";
    }
}
