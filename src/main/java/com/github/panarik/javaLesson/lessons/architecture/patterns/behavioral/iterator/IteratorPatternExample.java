package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.playLists.SongsArray;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.playLists.SongsArrayList;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.iterator.playLists.SongsMap;

public class IteratorPatternExample {

    public static void main(String[] args) {
        SongsArray songsArray = new SongsArray();
        SongsArrayList songsArrayList = new SongsArrayList();
        SongsMap songsMap = new SongsMap();

        SongsPlayer player = new SongsPlayer(songsArray, songsArrayList, songsMap);
        player.playSongs();
    }

}
