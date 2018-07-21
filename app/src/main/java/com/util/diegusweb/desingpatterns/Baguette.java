package com.util.diegusweb.desingpatterns;

public class Baguette extends Bread{

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public String description() {
        return "un baguet recien hecha";
    }

    @Override
    public String image() {
        return "R.drawable.baguette";
    }
}


