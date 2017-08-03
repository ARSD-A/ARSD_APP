package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Physics extends Activity {

    String na[] = {"Ms. Manorama Jain",
"Mr Pawan Kumar","Dr. Pinkey Dureja",
"Dr. Nutan Mishra",
"Dr. Geeta Senon",
"Dr. A.B. Bhattacharjee",
"Dr. Vinita tuli",
"Dr. Bajrang Lal Prashant",
"Mr. Pravata Kr. Behera",
"Mr. Rajveer Singh",
"Mr. Manish Kumar",
"Mr. S. Shankar Subramanian",
"Dr. Rakesh Malik",
"Dr. Manisha",
"Dr. Devendra Kumar Rana",
"Dr. Pankaj Narang",
"Dr. Ashutosh Vishwa Bandhu",
"Dr. Anjani Kumar Singh",
"Dr. Anjali Sharma Kaushik",
"Dr. Raghvendra",
"Dr. Avanish Pratap Singh Rajput",
"Dr. Arvind Kumar",
"Ms. Swati",
"Dr. Yogesh Kumar",
"Mr. Ashok",
"Mr. Lalit Kumar",
"Dr. Rita Singh",
"Mr. Bhupendra Singh","Mr. Mohd Sadiq	Physics"
};

     String ma[]=  {"j.manorama@yahoo.com",
"pawansingh.2547@gmail.com","pinky.dureja@gmail.com",
"mishra_nutan@ymail.com",
"geetasanon@hotmail.com",
"bhattach@arsd.du.ac.in",
"vinitatuli@gmail.com",
"bajranglal.prashant@gmail.com",
"pravat.arsd@gmail.com",
"rajveersingh2004@gmail.com",
"manishphy2007@gmail.com",
"shankar3274@gmail.com",
"malik.physics@gmail.com",
"manishaupadhyay9@gmail.com",
"devnatural@gmail.com",
"spress@rediffmail.com",
"ashutoshvb@gmail.com",
"anjaninsit@gmail.com",
"anjalisharma31@gmail.com",
"raghvendra.sspl@gmail.com",
"pushpa.ysingh@gmail.com",
"bhuarvind2512@gmail.com",
"swatiaditi2001@gmail.com",
"pushpa.ysingh@gmail.com",
"apoonia82@gmail.com",
"lalit.bittoo@gmail.com",
"ritasingh.singh88@gmail.com",
"rajbhupendra81@gmail.com",
"sadiqphy@gmail.com"
};
 
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
        s.setText("S.No.");
        s.setTextColor(Color.BLUE);
        s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        s.setPadding(25, 5, 10, 0);
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
            s.setPadding(25, 5, 10, 5);
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
