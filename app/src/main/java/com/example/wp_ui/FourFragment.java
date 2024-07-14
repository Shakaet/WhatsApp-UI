package com.example.wp_ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wp_ui.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class FourFragment extends Fragment {

    View view;
    private ArrayList<String> Names = new ArrayList<>();
    private ArrayList<String> Image2 = new ArrayList<>();

    private ArrayList<String> image2 = new ArrayList<>();
    private ArrayList<String> text1 = new ArrayList<>();
    private ArrayList<String> text2 = new ArrayList<>();
    private ArrayList<String> Image = new ArrayList<>();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_four, container, false);
        initRecyclerView();


        return view;
    }

    private void initRecyclerView(){

        RecyclerView recyclerView=view.findViewById(R.id.rec1);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter_class2 adapterClass2=new adapter_class2(image2,text1,text2,Image,getActivity());




        recyclerView.setAdapter(adapterClass2);


        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));



// for recyclerview1
        Image2.add("https://i.pinimg.com/564x/42/80/e2/4280e2292bcc3edc3e6d2c20ef32496b.jpg");
        Names.add("Trondheima");

        Image2.add("https://i.pinimg.com/564x/4d/93/fd/4d93fdd149ec7b2eada634da29b62833.jpg");
        Names.add("Portugal");

        Image2.add("https://i.redd.it/j6myfqglup501.jpg");
        Names.add("Rocky");


        Image2.add("https://i.pinimg.com/564x/3d/fe/32/3dfe3258d764aaa3908786ffbed1c64d.jpg");
        Names.add("Mahahual");

        Image2.add("https://i.pinimg.com/564x/d2/83/6f/d2836fe9693f80ff86284743bba5f559.jpg");
        Names.add("Frozen");


        Image2.add("https://i.pinimg.com/564x/16/b6/68/16b668236d2a573065fe729b909e3a92.jpg");
        Names.add("Whitent");

        Image2.add("https://i.pinimg.com/564x/20/a6/eb/20a6eb637f5743a6f29d7866285a92c2.jpg");
        Names.add("Austrailia");

        Image2.add("https://i.pinimg.com/564x/37/3e/0a/373e0abfdc6e92c5cce885ebacc2c095.jpg");
        Names.add("Washika");


// for recyclerview2


        image2.add("https://i.pinimg.com/564x/42/80/e2/4280e2292bcc3edc3e6d2c20ef32496b.jpg");
        text1.add("Trondheima");
        text2.add("53 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");

        image2.add("https://i.pinimg.com/564x/4d/93/fd/4d93fdd149ec7b2eada634da29b62833.jpg");
        text1.add("Portugal");
        text2.add("54 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");

        image2.add("https://i.redd.it/j6myfqglup501.jpg");
        text1.add("Rocky");
        text2.add("55 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");


        image2.add("https://i.pinimg.com/564x/3d/fe/32/3dfe3258d764aaa3908786ffbed1c64d.jpg");
        text1.add("Mahahuala");
        text2.add("56 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");

        image2.add("https://i.pinimg.com/564x/d2/83/6f/d2836fe9693f80ff86284743bba5f559.jpg");
        text1.add("Frozen");
        text2.add("57 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");


        image2.add("https://i.pinimg.com/564x/16/b6/68/16b668236d2a573065fe729b909e3a92.jpg");
        text1.add("Whitent");
        text2.add("58 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");

        image2.add("https://i.pinimg.com/564x/20/a6/eb/20a6eb637f5743a6f29d7866285a92c2.jpg");
        text1.add("Austrailia");
        text2.add("58 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");

        //image2.add("https://i.imgur.com/ZcLLrkY.jpg");

        image2.add("https://i.pinimg.com/564x/37/3e/0a/373e0abfdc6e92c5cce885ebacc2c095.jpg");
        text1.add("Washika");
        text2.add("59 minutes ago");
        Image.add("https://tse3.mm.bing.net/th?id=OIP.xthT8gmG5CgUHJr6tCYbTAHaHa&pid=Api&P=0&h=220");







    }


}