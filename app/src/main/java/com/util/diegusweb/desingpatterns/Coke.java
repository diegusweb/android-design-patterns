package com.util.diegusweb.desingpatterns;

public class Coke implements Drink{

    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public int calories() {
        return 140;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String image() {
        return null;
    }
}

