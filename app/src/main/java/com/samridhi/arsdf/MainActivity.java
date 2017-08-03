package com.samridhi.arsdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
    // ArrayList for person names
    ArrayList Names = new ArrayList<>(Arrays.asList(  "About Us",
            "Student Corner",
            "Academic Corner",
            "Fest",
            "Events",
            "Society",
            "College Map",
            "Canteen",
            "Innovation Project",
            "Alumni",
            "Achievements",
            "Contact Us"));
    ArrayList Images = new ArrayList<>(Arrays.asList(R.drawable.abhout,
            R.drawable.stu,
            R.drawable.acad,
            R.drawable.fest,
            R.drawable.event,
            R.drawable.society,
            R.drawable.i,
            R.drawable.c,
            R.drawable.ip,
            R.drawable.alumin,
            R.drawable.ach,
            R.drawable.contactus));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL );
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        MyAdapter myadapter = new MyAdapter(MainActivity.this, Names,Images);

        recyclerView.setAdapter(myadapter); // set the Adapter to RecyclerView

    }
}
