package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.playLists;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.SongsIterator;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.data.SongInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsArrayList implements SongsIterator {

    private final List<SongInfo> songsList = new ArrayList<>();

    public SongsArrayList() {
        songsList.add(new SongInfo("Song from list 1", "Band from list 1", 2000));
        songsList.add(new SongInfo("Song from list 2", "Band from list 2", 2000));
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        songsList.add(new SongInfo(songName, bandName, yearReleased));
    }

    public Iterator<SongInfo> createIterator() {
        return songsList.iterator();
    }
}
