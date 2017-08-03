package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Political extends Activity {

    String na[] = {"Mr. S.C. Jha",
"Dr. I. M . Jha",
"Dr. Anamika Prasad",
"Ms. Aggya Pandeya",
"Dr. Charu Mathur",
"Mr. Shambhu Nath Dubey",
"Dr. Amit Singh",
"Dr. Bhav Nath Jha",
"Dr. Indrajeet Kumar Jha",
"Dr. Sumit Prasher",
"Dr Prem Chand",
"Dr. Renu Keer",
"Mr Vikas Kumar",
"Dr. Surendra Singh",
"Mr. Dharmendra Kumar","Dr. Deelip Kumar",
"Mr. Bhavtosh Bhaskar"};

     String ma[]=  {"scjha09@gmail.com",
"imjhaa@gmail.com",
"anamika40@gmail.com",
"aggya.du@gmail.com",
"charusethimathur@gmail.com",
"dubeysn@gmail.com",
"amitsinghjnu@gmail.com",
"bnjhaphd@gmail.com",
"indrajeetjha@gmail.com",
"sumit_prasher@yahoo.com",
"prembarvar@gmail.com",
"renu.keer8@gmail.com",
"kumarvikas21@gmail.com",
"surendrabalwada@gmail.com",
"dharmendrakumarneeraj56@gmail.com","deelip14@gmail.com","bhavtosh.bhaskar@gmail.com"};
 
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
        s.setPadding(40, 5, 10, 0);
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
            s.setPadding(40, 5, 10, 5);
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
