package com.example.khoweisyen.mymusicapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class songfolder extends Fragment {

    private ArrayList<Music> arrayList;
    private list_adapter adapter;
    private ListView songList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_songfolder, container, false);

        songList = (ListView) rootView.findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new item("LoveTransfer","easonchan",R.raw.easonchan));
        arrayList.add(new item("Where is the Love","Remix",R.raw.blackeyepeas));
        arrayList.add(new item("Bibia Be Ye Ye","Ed Sheeran",R.raw.bibia));
        arrayList.add(new item("Where is the Love","Black Eye Peas",R.raw.blackeyepeas));



        adapter = new list_adapter(getActivity(), R.layout.music_item, arrayList);
        songList.setAdapter(adapter);

        return rootView;
    }

    }

