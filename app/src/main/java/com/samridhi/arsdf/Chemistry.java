package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Chemistry extends Activity {

    String na[] = {"Mr. Rajesh Kumar",
            "Dr. Nilmalini Moirangthem",
            "Dr. Kavita Bhatia",
            "Dr. Jaya Tomar",
            "Dr. Sunita Bhagat",
            "Dr. Suman  Dudeja","Mr. Naorem Premjit Singh",
            "Dr. Anju Bajaj","Dr. Prashant Singh","Dr. Sunita Bansal",
            "Dr. Rajeev Singh","Ms.Neeta Azad","Dr. Subash Chandra ","Dr. Sangita  Aggarwal ","Dr. Meenakshi Gupta","Dr. Bhaskara Nand" ,"Mr. Neeraj Mishra","Dr. Nidhi Dureja","Mr. Vishnu Kumawat","Dr. Sneh Lata","Ms. Anjali Verma","Mr. Om Prakash Yadav","Dr. Ram Swaroop Maharia","Dr. Anil Kumar","Mr. Bachan Meena"};
     String ma[]=  {"drajeshenzyme@gmail.com","nimalini@gmail.com","kavita9999@gmail.com","jayakhlesh@gmail.com","sunitabhagat28@rediffmail.com","dudejasuman@gmail.com","premjit.naorem@yahoo.in","anjug2222@yahoo.com","arsdchemistry@gmail.com","sbansalarsdcollege@gmail.com","rajeev@arsd.du.ac.in","neetaazad15@gmail.com","subashcm@gmail.com","sangita_1901@yahoo.co.in","meenaxi1978@gmail.com","bhaskarpantdu@gmail.com","neerajmishrarajdhani@gmail.com","durejanidhi@gmail.com","vishnukumawat@yahoo.co.in","sneh05@gmail.com","anjalidps@gmail.com","opy117@gamil.com","mahariaiitr@gmail.com","kalotraanil21@gmail.com","bachanmeena@gmail.com"};
 
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
        tr.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

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
            s.setTextColor(Color.BLACK);
            s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            s.setPadding(5, 5, 10, 5);
            tr.addView(s);  // Adding textView to tablerow.

            n = new TextView(this);
            n.setText(na[i]);
            n.setTextColor(Color.BLACK);
            n.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
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
