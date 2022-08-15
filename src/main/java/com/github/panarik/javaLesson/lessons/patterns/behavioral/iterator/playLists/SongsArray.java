package com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator.playLists;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator.SongsIterator;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator.data.SongInfo;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Represents input Array with song data for operating it.
 */
public class SongsArray implements SongsIterator {

    private SongInfo[] songsArray;

    public SongsArray() {
        songsArray = new SongInfo[]{
                new SongInfo("Name1", "Band1", 1990),
                new SongInfo("Name2", "Band2", 1990)
        };
    }

    public void addSong(String songName, String songBand, int yearReleased) {
        int index = songsArray.length; // Index for next song.
        SongInfo[] resultSongs = Arrays.copyOf(songsArray, index + 1); // new temp array with one empty index.
        resultSongs[index] = new SongInfo(songName, songBand, yearReleased); // add new song to temp array.
        this.songsArray = resultSongs; // put new array to property array.
    }

    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(songsArray).iterator();
    }
}