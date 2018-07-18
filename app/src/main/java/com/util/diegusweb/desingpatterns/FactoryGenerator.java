package com.util.diegusweb.desingpatterns;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factoryType){
        if(factoryType == null)
            return  null;

        if (factoryType == "BRE"){
            return new BreadFactory();
        }else if(factoryType == "FIL"){
            return new FillingFactory();
        }

        return null;
    }
}
