package com.example.khoweisyen.mymusicapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import javax.sql.ConnectionEvent;

public class playlist extends Fragment {

    private Button PlayButton,NextButton,PreviousButton;
    private SeekBar positionBar, volumeBar;
    private TextView elapsedTimeLable, remainingTimeLable,current;
    private MediaPlayer mediaPlayer;
    private int totalTime;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_playlist, container, false);

        PlayButton = (Button) rootView.findViewById(R.id.playButton);
        elapsedTimeLable = (TextView) rootView.findViewById(R.id.elapsedTimeLabel);
        remainingTimeLable = (TextView) rootView.findViewById(R.id.remainingTimeLabel);
        NextButton=(Button)rootView.findViewById((R.id.nextButton));
        PreviousButton=(Button)rootView.findViewById(R.id.previoustButton);


        final MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), R.raw.easonchan);
        mediaPlayer.setLooping(true);
        mediaPlayer.seekTo(0);
        mediaPlayer.setVolume(0.5f, 0.5f);
        totalTime = mediaPlayer.getDuration();
        positionBar = (SeekBar) rootView.findViewById(R.id.seekBar);
        positionBar.setMax(totalTime);

        /*SeekBar*/
        positionBar = (SeekBar)rootView.findViewById(R.id.seekBar);
        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                    positionBar.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }



        });









    /* volume control */
        volumeBar = (SeekBar) rootView.findViewById(R.id.volumeBar);
        volumeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float volumeNumber = progress / 100f;
                mediaPlayer.setVolume(volumeNumber, volumeNumber);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /* play&pause button */
        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mediaPlayer.isPlaying())
                {
                    mediaPlayer.start();
                    PlayButton.setBackgroundResource(R.drawable.pause);
                }

                else
                {
                    mediaPlayer.pause();
                    PlayButton.setBackgroundResource(R.drawable.play);
                }
            }
        });


        return rootView;
    }


}

