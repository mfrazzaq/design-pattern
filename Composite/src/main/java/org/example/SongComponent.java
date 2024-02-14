package org.example;

public abstract class SongComponent {
    private final String name;
    public SongComponent(String name){
        this.name = name;
    }
    public String getName() {return this.name;}
    public void play(){
        throw new UnsupportedOperationException();
    }
    public void add(Song song){
        throw new UnsupportedOperationException();
    }
    public void remove(int index) {
        throw new UnsupportedOperationException();
    }
    public SongComponent getChildAt(int i) {
        throw new UnsupportedOperationException();
    }
}
