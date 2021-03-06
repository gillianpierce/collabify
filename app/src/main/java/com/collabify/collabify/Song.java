package com.collabify.collabify;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by gillianpierce on 2017-11-18.
 */

public class Song {
    private String title, artist;
    private String artwork;
    private Integer votes;
    private String uri;
    private Integer positionInMs;

    public Song(){

    }

    public Song(String title, String artist, Integer votes, String uri, String artwork, Integer positionInMs){
        this.title = title;
        this.artist = artist;
        this.artwork = artwork;
        this.votes = votes;
        this.uri = uri;
        this.positionInMs = positionInMs;
    }


    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    //public void setmImage_url(Drawable artwork){
        //this.artwork = artwork;
    //}
    public void setVotes(Integer votes){this.votes = votes;}
    public void setUri(String uri){this.uri = uri;}
    public void setPositionInMs(Integer pos){this.positionInMs = pos;}

    //getters
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public Integer getVotes(){ return votes;}
    public String getUri(){return uri;}
    public String getImageURL(){return artwork;}
    //public Drawable getArtwork(){
        //return artwork;
    //}

    @Override
    public String toString() {
        return String.valueOf(uri) + "     " + String.valueOf(votes);
    }


    static public Song getSongFromID(String roomID, ArrayList<Song> songs){
        for(Song s: songs){
            if(s.uri.equals(roomID)){
                return s;
            }
        }
        return null;
    }

}
