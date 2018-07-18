package com.util.diegusweb.desingpatterns;

public abstract class AbstractFactory {

    abstract Bread getBread(String breadType);
    abstract Filling getFilling(String fillingtype);
    abstract Drink getDrink(String drinkType);
}


