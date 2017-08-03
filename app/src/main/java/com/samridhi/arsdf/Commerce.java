package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Commerce extends Activity {

    String na[] = {"Ms. Geetanjali Batra","Ms. Anu Priya Arora","Ms. Ruchika Kaura","Ms. Baljeet Kaur",
            "Ms. Parminder Kaur","Mr. Mohd. Rehan Alam","Dr. Renu Aggarwal","Mr. Ravinder Pant","Dr. Purushottam Kumar","Ms. Deepika", "Mr. Ajay Kumar","Mr. S. K.  Grover","Mr. Vinod Kumar Jain","Dr. V.K. Arora","Mr.Naresh Dhawan","Dr. Sandeep","Dr. Uma Sanjay Singh","Dr. Anjali Gupta","Ms. Nidhi Bansal","Dr. Manika Jain","Dr. Anamika Kadam","Ms. Kokila Negi","Ms. Indu Sigh"};
     
String ma[]=  {"ms.geetanjali.batra@gmail.com", "anupriya82@rediffmail.com","ruchikakaura@gmail.com",
"baljeet.kaur@rediffmail.com",
"parminderdu@gmail.com", 
"rehanalam.6@gmail.com",
"renugupta.hrc@gmail.com",
"ravinder7pant@gmail.com",
"purushottam-arya@fms.edu",
"deepika.ujjainwal@redififfmail.com",
"ajaycommerce9@gmail.com","sukeshgrover21@gmail.com",
"vinod.jain07@gmail.com",
"virenkarora@yahoo.com",
"nareshdhawan56@gmail.com",
"sandeep.arsd@gmail.com",
"umagulati@gmail.com",
"anjaligupta1975@yahoo.co.in",
"nidhi_arsd@yahoo.co.in",
"manika80@gmail.com",
"jovialanamika@gmail.com",
"kokilaboris@gmail.com",
"indu141182@gmail.com"};
 
     TableLayout tl;
     TableRow tr;
     TextView s,n,m;
    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
         tl = (TableLayout) findViewById(R.id.maintable);
        addHeaders();
        addData();  
    }
    /** This function add the headers to the table **/
    public void addHeaders(){

        /** Create a TableRow dynamically **/
        tr = new TableRow(this);
        tr.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        /** Creating a TextView to add to the row **/

        s = new TextView(this);
        s.setText("S.No. ");
        s.setTextColor(Color.BLUE);
        s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        s.setPadding(5, 5, 10, 0);
        tr.addView(s);  // Adding textView to tablerow.

        n = new TextView(this);
        n.setText("Name");
        n.setTextColor(Color.BLUE);
        n.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        n.setPadding(15, 5, 10, 0);
        tr.addView(n);  // Adding textView to tablerow.

        /** Creating another textview **/
        m = new TextView(this);
        m.setText("E-Mail");
        m.setTextColor(Color.BLUE);
        m.setPadding(15, 5, 0, 0);
        m.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tr.addView(m); // Adding textView to tablerow.

        // Add the TableRow to the TableLayout
        tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    }

    /** This function add the data to the table **/
    public void addData(){

        for (int i = 0; i < na.length; i++)
        {
            /** Create a TableRow dynamically **/
            tr = new TableRow(this);
            tr.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

            /** Creating a TextView to add to the row **/
            s = new TextView(this);
            s.setText(String.valueOf(i+1));
            s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            s.setTextColor(Color.BLACK);
            s.setPadding(5, 5, 10, 5);
            tr.addView(s);  // Adding textView to tablerow.

            n = new TextView(this);
            n.setText(na[i]);
            n.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            n.setTextColor(Color.BLACK);
            n.setPadding(15, 5, 10, 5);
            tr.addView(n);  // Adding textView to tablerow.

            /** Creating another textview **/
            m = new TextView(this);
            m.setText(ma[i]);
            m.setTextColor(Color.BLACK);
            m.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            m.setPadding(15, 5, 0, 5);
            tr.addView(m); // Adding textView to tablerow.

            // Add the TableRow to the TableLayout
            tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        }
    }
}
