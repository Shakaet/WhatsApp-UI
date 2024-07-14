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

public class adapter_class2 extends RecyclerView.Adapter<adapter_class2.viewholder> {

    public adapter_class2(ArrayList<String> img2, ArrayList<String> text1, ArrayList<String> text2, ArrayList<String> img, Context context) {
        this.img2 = img2;
        this.text1 = text1;
        this.text2 = text2;
        this.img = img;
        this.context = context;
    }

    private ArrayList<String> img2=new ArrayList<>();
    private ArrayList<String>text1=new ArrayList<>();
    private ArrayList<String>text2=new ArrayList<>();

    private ArrayList<String>img=new ArrayList<>();
    private Context context;


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout2, parent, false);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, @SuppressLint("RecyclerView") int position) {

        Glide.with(context)
                .asBitmap()
                .load(img2.get(position))
                .into(holder.img2);

        holder.t1.setText(text1.get(position));
        holder.t2.setText(text2.get(position));

        Glide.with(context)
                .asBitmap()
                .load(img.get(position))
                .into(holder.img);

        holder.img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(TAG, "onClick: clicked on an image: " + mNames.get(position));
                Toast.makeText(context, text1.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, text2.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return img2.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView img2,img;
        TextView t1,t2;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            img2=itemView.findViewById(R.id.image2);
            t1=itemView.findViewById(R.id.text1);
            t2=itemView.findViewById(R.id.text2);
            img=itemView.findViewById(R.id.image);
        }
    }
}
