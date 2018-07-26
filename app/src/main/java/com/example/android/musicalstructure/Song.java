package com.example.android.musicalstructure;

public class Song {

    private String mSongName;
    private String mArtist;
    public Song(String s,String a){
        mSongName = s;
        mArtist = a;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtist() {
        return mArtist;
    }
}
