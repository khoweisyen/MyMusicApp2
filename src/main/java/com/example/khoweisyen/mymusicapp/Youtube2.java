package com.example.khoweisyen.mymusicapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import android.support.v4.app.Fragment;
import com.google.api.client.repackaged.com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;

public class Youtube2 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener,YouTubePlayer.PlayerStateChangeListener
{

    public static final String API_KEY = "AIzaSyCyAhxVEYRpywIj5jlPGz0_2jYVbhzntLs";
    public static final String VIDEO_ID="";
    YouTubePlayerView youTubePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube2);

        /** Initializing YouTube Player View **/
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
    {
        //List<String>videoList= new ArrayList<>();
        //videoList.add("LL9NVmbQC24mr8IUFaxJqgFQ");
        //videoList.add("pvmNeNd5SYk");
        //youTubePlayer.loadVideos(videoList);
        youTubePlayer.loadPlaylist("PLM0fxxfjhaS3xJg9vgm7YQC1uA7GcSo7Q");

        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);

        if(!b)
        {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }

    @Override
    public void onPlaying()
    {

    }

    @Override
    public void onLoaded(String s)
    {

    }

    @Override
    public void onLoading()
    {

    }

    @Override
    public void onVideoEnded()
    {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason)
    {

    }

    @Override
    public void onAdStarted()
    {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onBuffering(boolean b)
    {

    }

    @Override
    public void onStopped()
    {

    }

    @Override
    public void onPaused()
    {

    }
    @Override
    public void onSeekTo(int i)
    {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
