package com.samridhi.arsdf;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

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
    public MyAdapter(Context context, ArrayList Names, ArrayList Img) {
        this.context = context;
        this.Names = Names;
        this.Img = Img;
    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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
        // holder.image.setPadding(8,8,8,8);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
                Intent i;
                Uri u;
                switch (position) {
                    case 0:
                        i = new Intent(context, Aboutus.class);
                        context.startActivity(i);
                        break;
                    case 1:
                        i = new Intent(context, StudentC.class);
                        context.startActivity(i);
                        break;
                    case 2:
                        i = new Intent(context, AcademicC.class);
                        context.startActivity(i);
                        break;
                    case 3:
                        i = new Intent(context, FestActicity.class);
                        context.startActivity(i);
                        break;
                    case 4:u = Uri.parse("https://docs.google.com/document/d/1Cx1c2rXWobefK_2dS06G9_V5O9-B7NpIMaOBNBnhr14/edit?usp=sharing");
                        i = new Intent(Intent.ACTION_VIEW, u);
                        context.startActivity(i);
                        break;
                    case 5:
                        i = new Intent(context, SocietyActivity.class);
                        context.startActivity(i);
                        break;
                    case 6:
                        i = new Intent(context, CollegeMap.class);
                        context.startActivity(i);
                        break;
                    case 7:
                        i = new Intent(context, CanteenActivity.class);
                        context.startActivity(i);
                        break;
                    case 8:
                        u = Uri.parse("http://iqac.arsdcollege.net/innovation.html");
                        i = new Intent(Intent.ACTION_VIEW, u);
                        context.startActivity(i);
                        break;
                    case 9:
                        u = Uri.parse("http://www.arsdcollege.net/alumni.aspx");
                        i = new Intent(Intent.ACTION_VIEW, u);
                        context.startActivity(i);
                        break;
                    case 10:
                        u = Uri.parse("http://www.arsdcollege.net/achievements.aspx?id=208");
                        i = new Intent(Intent.ACTION_VIEW, u);
                        context.startActivity(i);
                        break;

                    case 11:
                        u = Uri.parse("https://goo.gl/forms/07R4fA3wYnt7m8Ru2");
                        i = new Intent(Intent.ACTION_VIEW, u);
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