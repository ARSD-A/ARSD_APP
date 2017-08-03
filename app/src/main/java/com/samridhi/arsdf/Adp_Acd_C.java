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


public class Adp_Acd_C extends RecyclerView.Adapter<Adp_Acd_C.MyViewHolder> {

    ArrayList<String> names;
    ArrayList<Integer> pic;
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
    public Adp_Acd_C(Context context, ArrayList names, ArrayList pic) {
        this.context = context;
        this.names = names;
        this.pic = pic;
    }
    @Override
    public Adp_Acd_C.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_gridview, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder myviewholder = new MyViewHolder(v); // pass the view to View Holder
        return myviewholder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(names.get(position));
        holder.image.setImageResource(pic.get(position));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click

                Intent i;
                Uri u;
                switch (position) {
                    case 0: i=new Intent(context,Faculty.class);
                        context.startActivity(i);
                        break;
                    case 1: u= Uri.parse("http://www.arsdcollege.net/News_pdf/Prospectus2016.PDF");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 2:u= Uri.parse("http://www.arsdcollege.net/fee.aspx?id=217");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                    case 3: u= Uri.parse("http://www.arsdcollege.net/quicklink.aspx?id=227");
                        i=new Intent(Intent.ACTION_VIEW,u);
                        context.startActivity(i);
                        break;
                }
            }
        });

    }
    @Override
    public int getItemCount() {
        return names.size();
    }

}




