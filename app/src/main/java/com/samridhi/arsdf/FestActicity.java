package com.samridhi.arsdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FestActicity  extends Activity implements View.OnClickListener {
    ImageButton b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fest_acticity);
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.b1:
                i = new Intent(this, Dep_festActivity.class);
                startActivity(i);
                break;
            case R.id.b2:
                i = new Intent(this, TideActivity.class);
                startActivity(i);
                break;
        }
    }
}

