package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // English Songs
        SongComponent fiftyCents = new Song("Fifty Cents" , "Ali Zafar");
        SongComponent fiftyCentsRemix = new Song("Fifty Cents Remix" , "Ali Zafar");
        SongComponent fiftyCentsReverb = new Song("Fifty Cents Reverb" , "Ali Zafar");
        SongComponent fiftyCentsSlowed = new Song("Fifty Cents Slowed" , "Ali Zafar");
        ArrayList<SongComponent> english = new ArrayList<SongComponent>();
        english.add(fiftyCents);
        english.add(fiftyCentsRemix);
        english.add(fiftyCentsReverb);
        english.add(fiftyCentsSlowed);
        SongComponent englishSongsGroup = new SongGroup(english, "English Songs");

        // Hindi Songs
        SongComponent tujhaBulaDia = new Song("Tujhe Bula Diar" , "Shruti Phatak");
        SongComponent tujhaBulaDiaRemix = new Song("Tujhe Bula Dia Remix" , "Shruti Phatak");
        SongComponent tujhaBulaDiaReverb = new Song("Tujhe Bula Dia Reverb" , "Shruti Phatak");
        SongComponent tujhaBulaDiaSlowed = new Song("Tujhe Bula Dia Slowed" , "Shruti Phatak");
        ArrayList<SongComponent> hindi = new ArrayList<SongComponent>();
        hindi.add(tujhaBulaDia);
        hindi.add(tujhaBulaDiaRemix);
        hindi.add(tujhaBulaDiaReverb);
        hindi.add(tujhaBulaDiaSlowed);
        SongComponent hindiSongsGroup = new SongGroup(hindi, "Hindi Songs");

        // Pakistani Songs
        SongComponent zroriTha = new Song("Zrori Tha", "Rahat Fateh Ali");
        ArrayList<SongComponent> favoriteSongs = new ArrayList<>();
        favoriteSongs.add(englishSongsGroup);
        favoriteSongs.add(hindiSongsGroup);
        favoriteSongs.add(zroriTha);
        SongComponent favoriteSongsList = new SongGroup(favoriteSongs, "Favorite Songs");

        favoriteSongsList.play();

    }
}