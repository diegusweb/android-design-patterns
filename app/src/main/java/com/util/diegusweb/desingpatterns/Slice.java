package com.util.diegusweb.desingpatterns;

public class Slice implements Bread{

    @Override
    public String name() {
        return "Pan de molde";
    }

    @Override
    public int calories() {
        return 80;
    }

    @Override
    public String description() {
        return "Suave y tierno";
    }

    @Override
    public String image() {
        return "R.drawable.sliced";
    }

}


