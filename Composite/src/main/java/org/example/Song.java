package org.example;

public class Song extends SongComponent {
    private final String artist;
    public Song(String name, String artist){
        super(name);
        this.artist = artist;
    }
    public void info(){
        System.out.println("name: " + this.getName() + " artist:" + this.artist);
    }

    @Override
    public void play() {
        super.play();
        this.info();
        System.out.println("Playing....");
    }
}
