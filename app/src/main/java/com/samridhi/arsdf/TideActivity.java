package com.samridhi.arsdf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TideActivity extends Activity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tide);
        t= (TextView)findViewById(R.id.msg1);
       
        String s="Every Year Cultural Society of Atma Ram Sanatan Dharma College organize the annual annual cultural festival TIDE .The society organizes a series of events like \n-Mehandi\n-Rangoli\n-Poster Making\n-Sanskrit(Sholakagyan)\n-Photography\n-Folk/Classical Solo Dance\n-Chitra Karma\n-western Solo Dance\n-Western Solo Song\n-Jam Session\n-Fashion Show\n-One Act Play\n-English Debate\n-AdMad Show\n-Awareness Quiz\n-Semi Classical Solo Song\n-Classical Group Song\n-International Women's Day\n-Band Performance\n-Mr. & Ms. Tide\n-Newspaper Dressing\n-T-Shirt Painting\n-Western Group Dance\n-Star Performance";
      
      t.setText(s);

    }
}
