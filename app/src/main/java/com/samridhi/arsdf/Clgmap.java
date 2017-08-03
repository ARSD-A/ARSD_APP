package com.samridhi.arsdf;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Clgmap extends Activity {

    public static final String message1 = "msg1";
    public static final String message2 = "msg2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clgmap);
        Intent i = getIntent();
        String p = i.getStringExtra(message1);
        String p1 = i.getStringExtra(message2);
        TextView t1 = (TextView)findViewById(R.id.msg1);
        TextView t2 = (TextView)findViewById(R.id.msg2);
        t1.setText(p);
        t2.setText(p1);
    }
}
