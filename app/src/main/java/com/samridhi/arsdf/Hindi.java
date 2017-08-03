package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Hindi extends Activity {

    String na[] = {"Dr. Rashmi Bahl",
"Dr. Gyantosh Kr. Jha",
"Dr. Asha Pandey",
"Dr. Jaspali Chauhan",
"Dr. Renu Bala",
"Dr. Sanjay Singh Baghel",
"Dr. Rajesh Chand Adarsh","Ms. Geeta Devi",
"Mr. Vijay Narayan Mani",
"Dr. Anil Kumar Singh",
"Dr. Santosh Kumar",
"Dr. Ram Ratan Prasad",
"Dr. Arvind Kumar Mishra",
"Dr. Rubi Devi",
"Dr. Shridharam"};

     String ma[]=  {"drrashmibahl@gmail.com",
"principal.arsdcollege@gmail.com",
"pandey.asha@yahoo.co.in",
"chauhunjaspali@yahoo.com",
"rbala@arsd.du.ac.in",
"sanjaysinghdu@gmail.com",
"rcadarsh@gmail.com","geetadevi77@gmail.com",
"vijaym2004@gmail.com",
"anilrldu@gmail.com",
"santoshbablu82@gmail.com",
"ramratanprasadd@gmail.com",
"mishraarvind247@gmail.com",
"hrubidevi75@gmail.com",
"sdharam08@gmail.com"};
 
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
            s.setTextColor(Color.BLACK);
            s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
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
            m.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            m.setTextColor(Color.BLACK);
            m.setPadding(15, 5, 0, 5);
            tr.addView(m); // Adding textView to tablerow.

            // Add the TableRow to the TableLayout
            tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        }
    }
}
