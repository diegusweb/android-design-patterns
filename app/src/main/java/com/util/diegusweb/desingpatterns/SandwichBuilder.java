package com.util.diegusweb.desingpatterns;

public class SandwichBuilder {

    public static Sandwich cheeseAndHam(){

        Sandwich s = new Sandwich();
        s.addIngredient(new Slice());
        s.addIngredient(new Han());
        s.addIngredient(new Cheese());

        return s;
    }

    public static Sandwich rollCheese()
    {
        Sandwich s = new Sandwich();
        s.addIngredient(new Roll());
        s.addIngredient(new Cheese());
        s.addIngredient(new Tomato());

        return s;
    }

    public static Sandwich build(Sandwich s, Ingredient i){
        s.addIngredient(i);
        return s;
    }
}
