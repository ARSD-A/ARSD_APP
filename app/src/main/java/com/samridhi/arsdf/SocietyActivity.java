package com.samridhi.arsdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocietyActivity extends Activity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,b14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_society);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
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
    }

    public void onClick(View v) {
        Intent i ;
        String s1,s2,s3;
        switch (v.getId()) {
            case R.id.b1 : 
                s1="Cultural Society";
                s2=getString(R.string.cs);
                s3="Convenor Name - Dr. Nidhi Dureja\nConvenor Email - durejanidhi@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b2 : 
                s1="Dramatics Society";
                s2=getString(R.string.ds);
                s3="Convenor Name - Ms.Swati\nConvenor Email - swatiaditi2001@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);      
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3);         
                startActivity(i);
                break;
            case R.id.b3 :
                s1="English Debating Society";
                s2=getString(R.string.es);
                s3="Convenor Name - Ms.Mousumi Ray\nConvenor Email - anisumitaya@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b4 : 
                s1="Ambedkar Study Circle";
                s2=getString(R.string.ac);
                s3="Convenor Name - Dr. Prem Chand\nConvenor Email- prembarvar@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b5 : 
                s1="Gandhi Study Circle";
                s2=getString(R.string.gc);
                s3="Convenor Name - Mr.Gautam Choubey\nConvenor Email- gautam.choubey922@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b6 : 
                s1="Hindi Debating Society";
                s2=getString(R.string.hs);
                s3="Convenor Name - Ms. Vijjika Pandey Singh\nConvenor Email - vijjika@hotmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b7 : 
                s1="National Cadet Corps (NCC)";
                s2=getString(R.string.ncc);
                s3="Convenor Name - Dr. Sandeep\nConvenor Email - sandeep.arsd@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b8 : 
                s1="National Service Scheme(NSS)";
                s2=getString(R.string.nss);
                s3="Convenor Name - Ms. Swati\nConvenor Email - swatiaditi2001@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b9 : 
                s1="Women Development Cell";
                s2=getString(R.string.wdc);
                s3="Convenor Name - Dr. Anamik Prasad\nConvenor Email - anamika40@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b10 : 
                s1="Fine Arts & Crafts Society";
                s2=getString(R.string.cs);
                s3="Convenor Name - Dr. Anjali Gupta\nConvenor Email - anjaligupta1975@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b11 : 
                s1="Film Appreciation Society";
                s2=getString(R.string.fs);
                s3="Convenor Name - Ms. Maitrayee Roy Choudhury\n Convenor Email - maitrayee.rcy@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
            case R.id.b12 : 
                s1="Eco Club Society";
                s2=getString(R.string.es);
                s3="Convenor Name - Dr. Vibha Narang\nConvenor Email- dr.vibhanarang@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
           case R.id.b13 : 
                s1="North East Welfare Committee";
                s2=getString(R.string.news);
                s3="Convenor Name - Dr. Achingliu Kamei\nConvenor Email- achingliuk@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
           case R.id.b14 : 
                s1="Enactus";
                s2=getString(R.string.enactus);
                s3="Convenor Name - Dr. Manika Jain\nConvenor Email- manika80@gmail.com";
                 i=new Intent(SocietyActivity.this,Detail.class);
                i.putExtra(Detail.message1, s1);
                i.putExtra(Detail.message2, s2);
                i.putExtra(Detail.message3, s3); 
                startActivity(i);
                break;
        }
    }
}
