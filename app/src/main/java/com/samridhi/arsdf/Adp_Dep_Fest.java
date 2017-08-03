package com.samridhi.arsdf;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Adp_Dep_Fest extends RecyclerView.Adapter<Adp_Dep_Fest.MyViewHolder> {
    ArrayList<String> Names;
    ArrayList<Integer> Img;
    Context context;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.text);
            image= (ImageView) itemView.findViewById(R.id.picture);
        }
    }
    public Adp_Dep_Fest(Context context, ArrayList Names, ArrayList Img) {
        this.context = context;
        this.Names = Names;
        this.Img = Img;
    }
    @Override
    public Adp_Dep_Fest.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_gridview, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(Names.get(position));
        holder.image.setImageResource(Img.get(position));



        //holder.image.setScaleType(Image.ScaleType.CENTER_CROP);
        //holder.image.setPadding(8,8,8,8);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
                Intent i=new Intent(context,Detail.class);
                String s1,s2,s3;


                switch (position) {
                    case 0:s1="CHEMCROWN";
                        s2=context.getString(R.string.chem);
                        s3="Convenor Name - Dr. Meenakshi Gupta";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 1:s1="COMMERCICO";
                        s2=context.getString(R.string.com);
                        s3="Convenor Name - Dr. Uma Sanjay Singh";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 2:s1="TECH-A-THON";
                        s2=context.getString(R.string.comp);
                        s3="Convenor Name - Dr V.S. Dixit ";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 3:s1="QUAESTUS";
                        s2=context.getString(R.string.eco);
                        s3="Convenor Name - Mr. Ranjan Swarnakar";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 4:s1="SONNET";
                        s2=context.getString(R.string.eng);
                        s3="Convenor Name - Ms. Shibani Phukan";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 5:s1="HINDI PARISHAD";
                        s2=context.getString(R.string.hindi);
                        s3="Convenor Name - Arvind Kumar Mishra ";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 6:s1="CLIO CALLING";
                        s2=context.getString(R.string.his);
                        s3="Convenor Name - ";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 7:s1="TANGENTIA";
                        s2=context.getString(R.string.maths);
                        s3="Convenor Name - Mr. Kapil Kumar";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 8:s1="FEYNMANIA";
                        s2=context.getString(R.string.phy);
                        s3="Convenor Name - Dr. Bajrang Lal Prashant";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 9:s1="REPUBLICA";
                        s2=context.getString(R.string.pol);
                        s3="Convenor Name - Dr Indrajeet Kumar Jha";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                    case 10:s1="SRIJAN";
                        s2=context.getString(R.string.sank);
                        s3="Convenor Name - Dr. A. Sudha Devi";
                        i.putExtra(Detail.message1, s1);
                        i.putExtra(Detail.message2, s2);
                        i.putExtra(Detail.message3, s3);
                        context.startActivity(i);
                        break;
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return Names.size();
    }
}

