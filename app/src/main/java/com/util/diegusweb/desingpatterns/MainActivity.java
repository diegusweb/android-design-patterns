package com.util.diegusweb.desingpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SandwichBuilder builder = new SandwichBuilder();

        //jamon y queso
        Sandwich s1 = builder.cheeseAndHam();

        Log.d(TAG, "Primer sandwich ");
        s1.getIngredients();
        s1.getCalories();

        Sandwich s2 = builder.cheeseAndHam();
        builder.build(s2, new Tomato());
        Log.d(TAG, "Segundo sandwich ");
        s2.getIngredients();
        s2.getCalories();

        Sandwich s3 = new Sandwich();
        builder.build(s3, new Baguette());
        builder.build(s3, new Cheese());
        builder.build(s3, new Cheese());
        builder.build(s3, new Tomato());

        Log.d(TAG, "Tecer sandwich ");
        s3.getIngredients();
        s3.getCalories();

    }
}
