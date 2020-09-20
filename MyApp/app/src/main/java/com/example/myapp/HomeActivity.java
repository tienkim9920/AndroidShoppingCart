package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    LinearLayout activityTShirt;
    LinearLayout activityHat;

    private static final String TAG = "HomeActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

//    RecyclerView recyclerView;

//    ArrayList<MainModel> mainModels;
//
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<Integer> mImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Di Chuyen TShirt
        activityTShirt = findViewById(R.id.activityTShirt);

        activityTShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, TShirtActivity.class));
            }
        });

        //Di Chuyen Hat
        activityHat = findViewById(R.id.activityHat);

        activityHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, HatActivity.class));
            }
        });


//        getImages();

        //Anh Xa
        //Di chuyen Activity
        bottom_navigation = findViewById(R.id.bottom_navigation);

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

//    private void getImages(){
//        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
//
//        mImageUrls.add("https://scontent.fsgn2-4.fna.fbcdn.net/v/t1.15752-9/119568969_3091300790992833_5102995485213670642_n.jpg?_nc_cat=101&_nc_sid=b96e70&_nc_ohc=9fOrSaWzubsAX8Ylrir&_nc_ht=scontent.fsgn2-4.fna&oh=b7129df7a3984836775357f7e4921f82&oe=5F89B4FE");
//        mNames.add("Áo Yersin");
//
//        mImageUrls.add("https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/119941965_1386945168176305_5095638143802976663_n.webp?_nc_cat=102&_nc_sid=b96e70&_nc_ohc=G6fUoIzkYkgAX8ndxEk&_nc_ht=scontent.fsgn2-5.fna&oh=080e5aecdcc318abcee68732ca309d71&oe=5F8BB1BF");
//        mNames.add("Áo Sky");
//
//        mImageUrls.add("https://scontent.fsgn2-2.fna.fbcdn.net/v/t1.15752-9/119583163_335692090875640_21139168237149805_n.webp?_nc_cat=103&_nc_sid=b96e70&_nc_ohc=5Nkix6FLXPEAX_cQrur&_nc_ht=scontent.fsgn2-2.fna&oh=591de5b5a43e6a27e53c1c05f3a7dd81&oe=5F8BEE27");
//        mNames.add("Mũ Green");
//
//        mImageUrls.add("https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/119631823_421509539244149_3844452159769623928_n.jpg?_nc_cat=102&_nc_sid=b96e70&_nc_ohc=OiXVl_NOKXMAX9pKBHf&_nc_ht=scontent.fsgn2-5.fna&oh=acd720fcb2edde648c28feecb626d5ee&oe=5F89AFE4");
//        mNames.add("Flannel Sky");
//
//        mImageUrls.add("https://scontent.fsgn2-6.fna.fbcdn.net/v/t1.15752-9/105381055_588679382013065_6517911073796147569_n.jpg?_nc_cat=100&_nc_sid=b96e70&_nc_ohc=BRvjjlc3xqQAX8N5B7E&_nc_ht=scontent.fsgn2-6.fna&oh=e11886c550c0d3ebed4159d1edb0b8bf&oe=5F8A3CBD");
//        mNames.add("Áo Xser");
//
//        mImageUrls.add("https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/119684861_1489008991301255_6952114445013366034_n.jpg?_nc_cat=104&_nc_sid=b96e70&_nc_ohc=SBGphuFBxJUAX9ti3PN&_nc_ht=scontent.fsgn2-5.fna&oh=3e8fe8d7f2b1d32cea92e9cdffc6c564&oe=5F8C84EE");
//        mNames.add("Mũ Blue");
//
//        mImageUrls.add("https://scontent.fsgn2-6.fna.fbcdn.net/v/t1.15752-9/104435362_694680767772809_306465111177977502_n.webp?_nc_cat=110&_nc_sid=b96e70&_nc_ohc=93fA1Tj5cAoAX_Bx3TP&_nc_ht=scontent.fsgn2-6.fna&oh=fc86f02fc012eba3734066c5e66c2d16&oe=5F8CF26D");
//        mNames.add("Caro Xanh");
//
//        initRecyclerView();
//
//    }

//    private void initRecyclerView(){
//        Log.d(TAG, "initRecyclerView: init recyclerview");
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        recyclerView.setLayoutManager(layoutManager);
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
//        recyclerView.setAdapter(adapter);
//    }
}