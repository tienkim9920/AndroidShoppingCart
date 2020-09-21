package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Di chuyen Activity
        BottomNavigationView bottom_navigation = findViewById(R.id.bottom_navigation);

        bottom_navigation.setSelectedItemId(R.id.nav_home);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:

                    case R.id.nav_cart:
                        startActivity(new Intent(getApplicationContext(), CartActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.nav_shopping:
                        startActivity(new Intent(getApplicationContext(), ShopActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return true;

                    default:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        finish();
                        overridePendingTransition(0, 0);
                        return true;
                }
            }
        });
        //Di chuyen Activity


    }
}