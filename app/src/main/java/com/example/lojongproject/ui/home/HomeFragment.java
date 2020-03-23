package com.example.lojongproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lojongproject.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public ScrollView sview;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        /*


        final TextView textView = root.findViewById(R.id.text_home);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("Texto de Teste");
            }
        });*/
        sview = root.findViewById(R.id.home_scrollview);
        //sview.focusSearch(View.FOCUS_UP);
        sview.post(new Runnable() {
            @Override
            public void run() {
                sview.fullScroll(View.FOCUS_DOWN);
            }
        });

        final ImageView button5 = (ImageView) root.findViewById(R.id.imageView5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button6 = (ImageView) root.findViewById(R.id.imageView6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button7 = (ImageView) root.findViewById(R.id.imageView7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setImageResource(R.drawable.bt_water2);
            }
        });

        final ImageView button8 = (ImageView) root.findViewById(R.id.imageView8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button9 = (ImageView) root.findViewById(R.id.imageView9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button10 = (ImageView) root.findViewById(R.id.imageView10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button11 = (ImageView) root.findViewById(R.id.imageView11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setImageResource(R.drawable.bt_water2);
            }
        });

        final ImageView button12 = (ImageView) root.findViewById(R.id.imageView12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button13 = (ImageView) root.findViewById(R.id.imageView13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setImageResource(R.drawable.bt_water2);
            }
        });

        final ImageView button14 = (ImageView) root.findViewById(R.id.imageView14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button15 = (ImageView) root.findViewById(R.id.imageView15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button15.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button16 = (ImageView) root.findViewById(R.id.imageView16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button16.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button17 = (ImageView) root.findViewById(R.id.imageView17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setImageResource(R.drawable.bt_terrainvert2);
            }
        });

        final ImageView button18 = (ImageView) root.findViewById(R.id.imageView18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setImageResource(R.drawable.bt_terrainvert2);
            }
        });

        final ImageView button19 = (ImageView) root.findViewById(R.id.imageView19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button19.setImageResource(R.drawable.bt_terrain2);
            }
        });

        final ImageView button20 = (ImageView) root.findViewById(R.id.imageView20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button20.setImageResource(R.drawable.bt_terrain2);
            }
        });

        final ImageView button21 = (ImageView) root.findViewById(R.id.imageView21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button21.setImageResource(R.drawable.bt_terrain2);
            }
        });

        final ImageView button22 = (ImageView) root.findViewById(R.id.imageView22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button22.setImageResource(R.drawable.bt_terrainvert2);
            }
        });

        final ImageView button23 = (ImageView) root.findViewById(R.id.imageView23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button23.setImageResource(R.drawable.bt_watervert2);
            }
        });

        final ImageView button24 = (ImageView) root.findViewById(R.id.imageView24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button24.setImageResource(R.drawable.bt_watervert2);
            }
        });





        return root;
    }


}