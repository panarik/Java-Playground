package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.playLists;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.SongsIterator;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.data.SongInfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SongsMap implements SongsIterator {

    private final Map<Integer, SongInfo> songsMap = new HashMap<>();
    private int lastKey;

    public SongsMap() {
        songsMap.put(1, new SongInfo("Song from map1", "Band from map1", 2010));
        songsMap.put(2, new SongInfo("Song from map2", "Band from map2", 2010));
        lastKey = songsMap.size();
    }

    public void addSong(String songName, String songBand, int yearReleased) {
        songsMap.put(++lastKey, new SongInfo(songName, songBand, yearReleased));
    }

    public Iterator<SongInfo> createIterator() {
        return songsMap.values().iterator();
    }

}
