package com.samridhi.arsdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;


public class CollegeMap extends AppCompatActivity {

    ArrayList<String> Names = new ArrayList<>(Arrays.asList("Ground Floor",
            "First Floor",
            "Second Floor",
            "Rooms",
            "Laboratory",
            "Commerce Department"));
    ArrayList<Integer> Images = new ArrayList<>(Arrays.asList(R.drawable.gf,
            R.drawable.ff,
            R.drawable.sf,
            R.drawable.cr,
            R.drawable.l,
            R.drawable.cd));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegemap);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL );
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        Adp_Map myadapter = new Adp_Map(CollegeMap.this, Names,Images);

        recyclerView.setAdapter(myadapter); // set the Adapter to RecyclerView

    }
}
