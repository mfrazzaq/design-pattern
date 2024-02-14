package org.example;

import java.util.ArrayList;

public class SongGroup extends  SongComponent {
    private final ArrayList<SongComponent> songs;
    public SongGroup(ArrayList<SongComponent> song, String name){
        super(name);
        this.songs = song;
    }

    @Override
    public void play() {
        for(SongComponent value: this.songs){
            this.printSongs(value);
        }
    }

    private void printSongs(SongComponent songComponent) {
        if(songComponent instanceof Song){
            ((Song) songComponent).info();
        } else {
            System.out.println("------------------------------");
            System.out.println(songComponent.getName());
            songComponent.play();
            System.out.println("------------------------------");
        }
    }

    @Override
    public void add(Song song) {
        super.add(song);
        this.songs.add(song);
    }

    @Override
    public void remove(int index) {
        super.remove(index);
        if(this.songs.size() > index){
            this.songs.remove(index);
        } else {
            throw new ArrayIndexOutOfBoundsException("No item exists at the index");
        }
    }

    @Override
    public SongComponent getChildAt(int i) {
        super.getChildAt(i);
        if(this.songs.size() > i){
            return this.songs.get(i);
        } else {
            throw new ArrayIndexOutOfBoundsException("No item exists at the index");
        }
    }
}
