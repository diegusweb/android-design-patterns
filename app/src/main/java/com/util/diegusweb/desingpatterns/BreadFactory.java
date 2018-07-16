package com.util.diegusweb.desingpatterns;

public class BreadFactory {

    public Bread getBread(String breadType){

        if(breadType == "BAG"){
            return new Baguette();
        }else if(breadType == "ROL"){
            return new Roll();
        }else if(breadType == "SLI"){
            return new Slice();
        }

        return null;

    }
}
