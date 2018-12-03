package com.example.khoweisyen.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class Music extends AppCompatActivity {
 private static int animation = 7000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        new Handler().postDelayed(new Runnable()
        {
            @Override
                    public void run()
            {
                Intent homeIntent =new Intent(Music.this, MainActivity.class);
                startActivity(homeIntent);
            }
        } ,animation);
    }
}
