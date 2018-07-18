package com.util.diegusweb.desingpatterns;

public class FillingFactory extends AbstractFactory{

    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingtype) {
        if(fillingtype == "CHE"){
            return new Cheese();
        }else if(fillingtype == "TOM"){
            return new Tomato();
        }else if(fillingtype == "HAN"){
            return new Han();
        }

        return null;
    }
}
