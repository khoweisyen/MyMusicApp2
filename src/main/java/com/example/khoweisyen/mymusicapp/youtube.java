package com.example.khoweisyen.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class youtube extends Fragment {

        private Button yourButton;

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.activity_youtube, container, false);

        yourButton=(Button) rootView.findViewById(R.id.video);
        Intent intent = new Intent(getActivity(),Youtube2.class);
        startActivity(intent);

        return rootView;
    }







}

