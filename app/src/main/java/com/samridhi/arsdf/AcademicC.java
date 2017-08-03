package com.samridhi.arsdf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

public class AcademicC extends Activity {

    Context context;
    // ArrayList for gridview items (names and picture)
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Faculty",
            "Prospectus",
            "Fee",
            "Magazine"));
    ArrayList<Integer> picture = new ArrayList<>(Arrays.asList(R.drawable.faculty,
            R.drawable.pro,
            R.drawable.fee,
            R.drawable.mag));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_c);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL );
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        Adp_Acd_C adapter = new Adp_Acd_C(AcademicC.this, names, picture);

        recyclerView.setAdapter(adapter); // set the Adapter to RecyclerView
    }
}

  
