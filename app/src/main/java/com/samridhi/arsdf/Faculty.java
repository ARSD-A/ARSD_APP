package com.samridhi.arsdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faculty extends Activity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
    }

    public void onClick(View v) {
              Intent i;
              switch (v.getId()) {
            case R.id.button1 :  i= new Intent(this, Botany.class);
                startActivity(i);
                break;
            case R.id.button2 : i= new Intent(this, Chemistry.class);
                startActivity(i);
                break;
            case R.id.button3 : i= new Intent(this, Commerce.class);
                startActivity(i);
                break;

            case R.id.button4 :  i= new Intent(this, Computer.class);
                startActivity(i);
                break;
            case R.id.button5 :i= new Intent(this, Economics.class);
                startActivity(i);
                break;
            case R.id.button6 : i= new Intent(this, Electronics.class);
                startActivity(i);
                break;
                
            case R.id.button7 :i= new Intent(this, English.class);
                startActivity(i);
                break;
            case R.id.button8 :i= new Intent(this, Hindi.class);
                startActivity(i);
                break;
            case R.id.button9 :i= new Intent(this, History.class);
                startActivity(i);
                break;
            case R.id.button10 :i= new Intent(this, Mathematics.class);
                startActivity(i);
                break;
            case R.id.button11 :i= new Intent(this, Physics.class);
                startActivity(i);
                break;
            case R.id.button12 :i= new Intent(this, Political.class);
                startActivity(i);
                break;
            case R.id.button13 :i= new Intent(this, Sanskrit.class);
                startActivity(i);
                break;
            case R.id.button14 :i= new Intent(this, Zoology.class);
                startActivity(i);
                break;
            case R.id.button15 :i= new Intent(this, Sports.class);
                startActivity(i);
                break;
            
        }

    }
}
