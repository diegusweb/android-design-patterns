package com.util.diegusweb.desingpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView textView = findViewById(R.id.text_view);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("BAG");

        textView.setText(new StringBuilder()
                .append(bread.name())
                .append(bread.calories())
                .toString());*/
    }
}
