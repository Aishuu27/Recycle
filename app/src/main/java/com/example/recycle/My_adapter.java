package com.example.recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class My_adapter extends RecyclerView.Adapter<My_adapter.MyViewHolder > {
    String data1[],data2[];
    int images[];
    Context context;
    public My_adapter(Context ct, String st1[], String st2[], int image[]){
        context =ct;
        data1=st1;
        data2=st2;
        images=image;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View v= inflater.inflate(R.layout.my_row,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(data1[position]);
        holder.description.setText(data2[position]);
        holder.image.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title,description;
        ImageView image;
         public MyViewHolder(@NonNull View v){
             super(v);
             title=v.findViewById(R.id.title);
             description=v.findViewById(R.id.description);
             image=v.findViewById(R.id.image);

         }
    }
}
