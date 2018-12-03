package com.example.khoweisyen.mymusicapp;

public class item extends Music{
    private static String name;
    private static String singer;
    private static int song;

    public item(String name, String singer, int song) {
        this.name = name;
        this.singer = singer;
        this.song = song;
    }

    public static String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static String getSinger()
    {
        return singer;
    }

    public void setSinger(String singer)
    {
        this.singer = singer;
    }

    public static int getSong()
    {
        return song;
    }

    public void setSong(int song)
    {
        this.song = song;
    }


}


