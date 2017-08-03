package com.samridhi.arsdf;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Adp_Stu_C extends RecyclerView.Adapter<Adp_Stu_C.MyViewHolder> {

    ArrayList<String> Names;
    ArrayList<Integer> Images;
    Context context;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.text);
            image = (ImageView) itemView.findViewById(R.id.picture);
        }
    }
    public Adp_Stu_C(Context context, ArrayList Names, ArrayList Images) {
        this.context = context;
        this.Names = Names;
        this.Images = Images;
    }
    @Override
    public Adp_Stu_C.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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
        holder.image.setImageResource(Images.get(position));



        //holder.image.setScaleType(Image.ScaleType.CENTER_CROP);
        // holder.image.setPadding(8,8,8,8);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
                int p=position;
                Intent i;
                Uri u;
                switch (p) {
                    case 0:u= Uri.parse("http://www.sggscc.ac.in/pdf/cal.pdf");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 1:u= Uri.parse("http://www.arsdcollege.net/timtab.aspx");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 2:u= Uri.parse("http://www.arsdcollege.net/attendance.aspx");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 3:u= Uri.parse("http://www.arsdcollege.net/internalassessment.aspx?id=213");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 4: u= Uri.parse("http://exam.du.ac.in/UG-datesheets.html");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 5:u=Uri.parse("http://exam.du.ac.in/UG-result.html");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 6:i=new Intent(context,Courses.class);
                        context.startActivity(i);
                        break;
                    case 7: i=new Intent(context,Scholar.class);
                        context.startActivity(i);
                        break;
                    case 8: u= Uri.parse("http://www.arsdcollege.net/studentsunion.aspx?id=209");
                        i=new Intent(Intent.ACTION_VIEW,u);
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

