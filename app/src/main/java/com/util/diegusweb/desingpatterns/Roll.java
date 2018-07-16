package com.util.diegusweb.desingpatterns;

public class Roll implements Bread{

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public String calories() {
        return " : 169 kcal";
    }
}
