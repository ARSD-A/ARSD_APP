package com.samridhi.arsdf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentC extends AppCompatActivity {

    ArrayList<String> Names = new ArrayList<>(Arrays.asList("Academic Calender",
            "Time Table",
            "Attendance",
            "Internal Assessments",
            "Datesheets",
            "Results",
            "Courses",
            "Scholarships",
            "Student Union"));
    ArrayList<Integer> Images = new ArrayList<>(Arrays.asList(R.drawable.cal,
            R.drawable.tt,
            R.drawable.attend,
            R.drawable.ia,
            R.drawable.date,
            R.drawable.result,
            R.drawable.course,
            R.drawable.ss,
            R.drawable.union));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_c);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL );
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        Adp_Stu_C myadapter = new Adp_Stu_C(StudentC.this, Names,Images);

        recyclerView.setAdapter(myadapter); // set the Adapter to RecyclerView

    }
}
