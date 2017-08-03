package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class Mathematics extends Activity {

    String na[] = {"Mrs. Shanti Pahwa",
"Mr. A S Prajapati",
"Dr. Monica Suri",
"Dr. B.K. Tyagi",
"Ms. Jyoti Kaushik",
"Dr. Pratibha Mehrotra",
"Ms. Shilpi Jain",
"Dr. Preeti Jain",
"Dr. Amit Mittal",
"Mr. Agam Dwivedi",
"Dr.. Kanika Sharma",
"Mr. Amit Kumar",
"Mr. Raj Kumar Bhagat",
"Ms. Priyanka Yadav",
"Mr. Chhatra Pal",
"Mr. Kapil Kumar",
"Mr. Anil Kumar Rajak",
"Mr. Ashutosh Meena","Mr. Anant Tiwari",
"Mr. Rajpal Rajbhar"};

     String ma[]=  {"shantipahwa@gmail.com",
"prajapati_anand@yahoo.com",
"monicasuri2010@gmail.com",
"brijkishore.tyagi@gmail.com",
"jyotikaushik.arsd@gmail.com",
"pratibhamehrotra@gmail.com",
"shelpej@yahoo.com",
"prshajain@gmail.com",
"to.amitmittal@gmail.com","-",
"kanika.divika@gmail.com",
"amit_dwivedi05@yahoo.co.in",
"rkbhagat@arsd.du.ac.in",
"88.priyanka@gmail.com",
"chhtrpl@gmail.com",
"kapilkumarmaths@gmail.com",
"aniliitdelhimathematics@gmail.com",
"loginashutosh@gmail.com","anant9tiwari@gmail.com",
"bhardwajrajpal@gmail.com"};
 
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
