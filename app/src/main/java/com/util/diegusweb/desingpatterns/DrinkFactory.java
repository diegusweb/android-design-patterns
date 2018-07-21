package com.util.diegusweb.desingpatterns;

public class DrinkFactory extends AbstractFactory {
    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingtype) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        if(drinkType == null) return null;

        if(drinkType == "COK"){
            return new Coke();
        }else if(drinkType == "BEE"){
            return new Beer();
        }

        return null;
    }
}
