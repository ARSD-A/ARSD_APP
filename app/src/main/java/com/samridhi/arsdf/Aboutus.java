package com.samridhi.arsdf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Aboutus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        CharSequence s = "Atma Ram Sanatan Dharma College (ARSD College), formerly Sanatan Dharma College, " +
                "is a co-educational best constituent college of the University of Delhi." +
                "\n\nThe college was founded on August 3, 1959 by the Sanatan Dharma Sabha, " +
                "Delhi. Late Shri Atma Ram Chadha, a well-known philanthropist, took over as chairman " +
                "of the college governing body in 1967.\n\n In 2017, As per the list announced by HRD " +
                "Minister which has been prepared on basis of a survey of \"general degree\" colleges " +
                "under the National Institutional Ranking Framework (NIRF), ARSD College has been ranked " +
                "all India 5th position in College category for the first time.\n\n";
        t1.setText(s);
        CharSequence s2 = "Address : Dhaula Kuan, New Delhi 110021 \n" +
                "Phone : +91 11 24113436, 24117508\n Fax No : +91 11 24111390\n" +
                "E-mail : principal.arsdcollege@gmail.com, principal@arsd.du.ac.in";
        t2.setText(s2);
    }
};
