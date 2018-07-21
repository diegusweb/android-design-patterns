package com.util.diegusweb.desingpatterns;

public class Roll implements Bread{

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public int calories() {
        return 169;
    }

    @Override
    public String description() {
        return "un roll demo";
    }

    @Override
    public String image() {
        return "R.drawable.roll";
    }
}
