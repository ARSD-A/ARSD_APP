package com.samridhi.arsdf;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class CanteenActivity extends Activity {

    String item[] = {"Samosa","Bread Pakora","Bread Roll","Cream Roll","Sandwich Veg","Veg Burger","Veg Pettis","Veg Cutlate","Butter Slice","Double Egg Omlet with 2 Slice Bread","Tea","Coffee","Cold Drink","Spring Roll","Momos","Macroni","Pasta","Chilly Potato","Chhole Rice","Rajma Rice","Kadhi Rice","Puri Sabji","Lassi","Bottle Water","Chhole Bhature","Thali(Rice,Roti/Puri-2,Sabji,Raita,Salad)","Veg Choumin","Masala Dhosa Shambher","Kachuri with Sabji","Sambher Wada","Uttapam","Rasgulla","Barfi","Laddoo Besan","Rasmalai","Halwa - Gajar","Ice Cream"};
     String price[]=  {"7","8","10","10","10","10","10","10","8","20","6","8","MRP","15","25","20","20","20","30","30","30","20","15","MRP","20","45","20","40","30","20","20","25","12","12","12","15","20","MRP"};
 
     TableLayout tl;
     TableRow tr;
     TextView s,itemtext,pricetext;
    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
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
        tr.addView(s);  // Adding textView to tablerow

        TextView itemtext = new TextView(this);
        itemtext.setText("Items");
        itemtext.setTextColor(Color.BLUE);
        itemtext.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        itemtext.setPadding(15, 5, 10, 0);
        tr.addView(itemtext);  // Adding textView to tablerow

        /** Creating another textview **/
        TextView pricetext = new TextView(this);
        pricetext.setText("Price");
        pricetext.setTextColor(Color.BLUE);
        pricetext.setPadding(15, 5, 0, 0);
        pricetext.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        tr.addView(pricetext); // Adding textView to tablerow.

        // Add the TableRow to the TableLayout
        tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
   }

    /** This function add the data to the table **/
    public void addData(){

        for (int i = 0; i < item.length; i++)
        {
            /** Create a TableRow dynamically **/
            tr = new TableRow(this);
            tr.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

            /** Creating a TextView to add to the row **/
           s = new TextView(this);
            s.setText(String.valueOf(i));
            s.setTextColor(Color.BLACK);
           s.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            s.setPadding(5, 5, 10, 5);
            tr.addView(s);  // Adding textView to tablerow.

            itemtext = new TextView(this);
            itemtext.setText(item[i]);
            itemtext.setTextColor(Color.BLACK);
            itemtext.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            itemtext.setPadding(15, 5, 10, 5);
            tr.addView(itemtext);  // Adding textView to tablerow.

            /** Creating another textview **/
            pricetext = new TextView(this);
            pricetext.setText(price[i]);
            pricetext.setTextColor(Color.BLACK);
            pricetext.setPadding(15, 5, 0, 5);
            pricetext.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
            tr.addView(pricetext); // Adding textView to tablerow.

            // Add the TableRow to the TableLayout
            tl.addView(tr, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        }
    }
}
