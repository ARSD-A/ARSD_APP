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


public class Adp_Map extends RecyclerView.Adapter<Adp_Map.MyViewHolder> {
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
    public Adp_Map(Context context, ArrayList Names, ArrayList Img) {
        this.context = context;
        this.Names = Names;
        this.Img = Img;
    }
    @Override
    public Adp_Map.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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



        // holder.image.setScaleType(Image.ScaleType.CENTER_CROP);
        // holder.image.setPadding(8,8,8,8);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
                Intent i;
                String s,s1;
                int p=position;
                switch (p) {
                    case 0:
                        i = new Intent(context, Clgmap.class);
                        s = "GROUND FLOOR";
                        s1 = "-Staff Room\n-Departmental Staff Rooms(Behind Staff Room)\n-CollegeOffice\n-Chemistry Lab-1\n-Physics Lab-1\n-Chemistry Department Office\n-Physics Department Office\n-Law Center-2\n-Library\n-Room No-1,2,3,4,5A,5B,6,18,19\n\n-NEAR GROUND\n     -Classrooms : P-1,P-2,P-3 \n     -Chemistry Lab-3\n     -Biology Lab\n\n-NEAR CANTEEN AREA\n     -Bank\n     -Accounts Section\n     -Department of Physical Education\n     -Skill Development Cell\n     -GCR\n     -Cultural Society\n     -NCC Room\n     -CL-1,CL-2,CL-3,CL-4\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
                        context.startActivity(i);
                        break;
                    case 1:
                        i = new Intent(context, Clgmap.class);
                        s = "FIRST FLOOR";
                        s1 = "-Seminar Room\n-Electronic Lab-3\n-Chemistry Lab-2\n-Room No-27-38,40-49,52,63\n-Women Development Cell\n-Microelectronic Research Laboratories\n-Organic Synthesis Research Laboratories\n-Bio Organic Chemistry Laboratories\n-Experimental Research Laboratories\n\n\n\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
                        context.startActivity(i);
                        break;
                    case 2:
                        i = new Intent(context, Clgmap.class);
                        s = "SECOND FLOOR";
                        s1 = "-T1-T12\n\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
                        context.startActivity(i);
                        break;
                    case 5:
                        i = new Intent(context, Clgmap.class);
                        s = "COMMERCE\n DEPARTMENT";
                        s1 = "-Room No 1-6\n\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
                        context.startActivity(i);
                        break;
                    case 3:
                        i = new Intent(context, Clgmap.class);
                        s = "ROOMS";
                        s1 = "-GROUND FLOOR:-\nRoom No.- \t1,2,3,4,5A,5B,6,18,19\n\n-FIRST FLOOR:-\n32-38,52,63,27-31,40-51\n\n-THIRD FLOOR:-T1-T9\n\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
                        context.startActivity(i);
                        break;
                    case 4:
                        i = new Intent(context, Clgmap.class);
                        s = "LABS";
                        s1 = "-Near Canteen Area:- CL-1,CL-2,CL-3,CL-4 \n-Ground Floor:- Physics Lab-1 \n-Ground Floor:- Chemistry Lab-1 \n-First Floor:- Chemistry Lab-2\n-First Floor:- Electronics Lab-2\n\n-Photostat Shop near Commerce Department";
                        i.putExtra(Clgmap.message1, s);
                        i.putExtra(Clgmap.message2, s1);
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



