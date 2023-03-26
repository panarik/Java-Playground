package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.data.SongInfo;

import java.util.Iterator;

public class SongsPlayer {

    //Grab all Iterators from all type of lists.
    private final SongsIterator songsArray;
    private final SongsIterator songsList;
    private final SongsIterator songsMap;

    public SongsPlayer(SongsIterator songsArray, SongsIterator songsList, SongsIterator songsMap) {
        this.songsArray = songsArray;
        this.songsList = songsList;
        this.songsMap = songsMap;
    }

    public void playSongs() {
        System.out.println("\nSongs from array.");
        playCurrentList(songsArray.createIterator());

        System.out.println("\nSongs from list.");
        playCurrentList(songsList.createIterator());

        System.out.println("\nSongs from map.");
        playCurrentList(songsMap.createIterator());
    }

    private void playCurrentList(Iterator<SongInfo> songs) {
        while (songs.hasNext()) {
            SongInfo song = songs.next();
            System.out.println(song);
        }
    }
}
