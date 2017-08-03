package com.samridhi.arsdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public class Dep_festActivity extends AppCompatActivity {

    ArrayList<String> Names = new ArrayList<>(Arrays.asList("Chemistry",
            "Commerce",
            "Computer Science",
            "Economics",
            "English",
            "Hindi",
            "History",
            "Mathematics",
            "Physics",
            "Political Science",
            "Sanskrit"));
    ArrayList<Integer> Images = new ArrayList<>(Arrays.asList(R.drawable.chemcrown,
            R.drawable.commerce,
            R.drawable.techathon,
            R.drawable.eco,
            R.drawable.eng,
            R.drawable.hindi,
            R.drawable.his,
            R.drawable.maths,
            R.drawable.phy,
            R.drawable.pol,
            R.drawable.sans));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_fest);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL );
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        Adp_Dep_Fest myadapter1 = new Adp_Dep_Fest(Dep_festActivity.this, Names,Images);

        recyclerView.setAdapter(myadapter1); // set the Adapter to RecyclerView

    }
}




