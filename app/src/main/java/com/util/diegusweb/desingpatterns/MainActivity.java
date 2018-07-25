package com.util.diegusweb.desingpatterns;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);

        }

        final DrawerLayout drawerLayout = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer){
            public void onDrawerOpened(View v){
                super.onDrawerOpened(v);
                Log.d(TAG, "onDrawerOpened");
            }

            public void onDrawerClosed(View v){
                super.onDrawerClosed(v);
                Log.d(TAG, "onDrawerClosed");
            }
        };

        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        //seleccion de cada item del menu
        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                drawerLayout.closeDrawers();

                switch (item.getItemId()){
                    case R.id.drama:
                        ContentFragment fragment = new ContentFragment();
                        FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment, fragment);
                        transaction.addToBackStack(null);
                        transaction.commit();

                        Log.d(TAG, "onNavigationItemSelected :drama");
                        return true;
                    case R.id.comedy:
                        Log.d(TAG, "onNavigationItemSelected :comedia");
                        return true;
                    case R.id.misterio:
                        Log.d(TAG, "onNavigationItemSelected :mistero");
                        return true;
                        default:
                            return false;
                }

            }
        });


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }
}
