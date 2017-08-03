package com.samridhi.arsdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        TextView t1=(TextView)findViewById(R.id.t1);
        TextView t2=(TextView)findViewById(R.id.t2);
        CharSequence s="UNDERGRADUATE COURSES:\nThe college offers the following undergraduate programmes:\n-B Com (Hons)\n\n-B Sc (Hons)\n      B Sc (Hons) Chemistry\n      B Sc (Hons) Computer Science\n      B Sc Physical Science Chemistry\n      B Sc Physical Science Computer Science\n      B Sc Physical Science Electronics\n      B Sc (App. Phy. Sc.)Ind. Chemsitry\n      B Sc (Hons) Electronics\n      B Sc (Hons) Mathematics\n      B Sc (Hons) Physics\n\n-BA\n\n-BA (Hons)\n      BA (Hons) Economics\n      BA (Hons) English\n      BA (Hons) Hindi\n      BA (Hons) History\n      BA (Hons) Political Science\n\n-BA Program\n";
        t1.setText(s);
        CharSequence s2="POSTGRADUATION COURSES:\nThe college offers the following postgraduation programmes:\n-M A\n      MA English\n      MA Hindi\n      MA Political Science\n\n-M Com";
        t2.setText(s2);
    }
}
