package com.util.diegusweb.desingpatterns;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private static final String TAG = "Sandwich";
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void getCalories(){
        int calories = 0;
        for (Ingredient i: ingredients){
            calories += i.calories();
        }
        Log.d(TAG, "Total de calotias: "+calories+" kcal");
    }

    public void getIngredients(){
        for (Ingredient i: ingredients){
            Log.d(TAG, i.name() + " "+i.calories()+" kcal");
        }
    }
}
