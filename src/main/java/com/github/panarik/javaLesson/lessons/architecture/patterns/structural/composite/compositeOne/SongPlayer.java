package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeOne;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.compositeOne.songComponents.SongComponent;

/**
 * Defines song player which use list of {@link SongComponent}.
 */
public class SongPlayer {

    private final SongComponent songList;

    public SongPlayer(SongComponent songComponent) {
        this.songList = songComponent;
    }

    public void getSongList() {
        this.songList.displaySongInfo();
    }

}
