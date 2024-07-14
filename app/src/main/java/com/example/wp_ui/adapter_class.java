package com.example.wp_ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adapter_class extends RecyclerView.Adapter<adapter_class.viewholder> {

    private ArrayList<String> img=new ArrayList<>();
    private ArrayList<String>text1=new ArrayList<>();
    private ArrayList<String>text2=new ArrayList<>();

    private ArrayList<String>text3=new ArrayList<>();
    private Context context;

    public adapter_class(ArrayList<String> img, ArrayList<String> text1, ArrayList<String> text2, ArrayList<String> text3, Context context) {
        this.img = img;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.context = context;
    }



    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, @SuppressLint("RecyclerView") int position) {

        Glide.with(context)
                .asBitmap()
                .load(img.get(position))
                .into(holder.img);

        holder.t1.setText(text1.get(position));
        holder.t2.setText(text2.get(position));
        holder.t3.setText(text3.get(position));

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(TAG, "onClick: clicked on an image: " + mNames.get(position));
                Toast.makeText(context, text1.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, text2.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, text3.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return img.size();
    }


    public class viewholder extends RecyclerView.ViewHolder {

       ImageView img;
       TextView t1,t2,t3;


       public viewholder(@NonNull View itemView) {
           super(itemView);

           img=itemView.findViewById(R.id.image2);
           t1=itemView.findViewById(R.id.text1);
           t2=itemView.findViewById(R.id.text2);
           t3=itemView.findViewById(R.id.text3);

       }
   }
}
