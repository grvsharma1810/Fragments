package com.example.fragmen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class fragment3 extends Fragment {
    private static final String TAG = "Fragment 3";
    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavActivity2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fargment3_layout, container,false);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        btnNavActivity2 = (Button) view.findViewById(R.id.btnNavActivity2);

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Navigating to Fragment 1", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Navigating to Fragment 2", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Navigating to Fragment 3", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnNavActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Navigating to Second Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), second_activity.class);
                startActivity(intent);

            }
        });
        return view;
    }
}
