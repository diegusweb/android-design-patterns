package com.util.diegusweb.desingpatterns;

public class Beer implements Drink{

    @Override
    public String name() {
        return "Cerveza";
    }

    @Override
    public int calories() {
        return 155;
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
