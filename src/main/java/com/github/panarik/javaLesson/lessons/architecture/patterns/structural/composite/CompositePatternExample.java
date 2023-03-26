package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.songComponents.Song;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.songComponents.SongComponent;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.songComponents.SongGroup;

public class CompositePatternExample {

    public static void main(String[] args) {

        // Create groups of songs.
        SongComponent rootGroup = new SongGroup("Root list", "");
        SongComponent ninetiesGroup = new SongGroup("90s", "Music from 90s");
        SongComponent popMusic = new SongGroup("Pop music from 90s", "Pop music");

        // Root group contain:
        rootGroup.add(new Song("LoginSound", "System sounds", 2020));
        rootGroup.add(ninetiesGroup);

        // Group '90s' contain:
        ninetiesGroup.add(new Song("Song1 from 90s", "Band from 90s", 1995));
        ninetiesGroup.add(new Song("Song2 from 90s", "Band from 90s", 1995));
        ninetiesGroup.add(popMusic);

        // Pop music contain:
        popMusic.add(new Song("Pop1", "Pop band", 1990));
        popMusic.add(new Song("Pop2", "Pop band", 1990));
        popMusic.add(new Song("Pop3", "Pop band", 1990));

        // Create player.
        SongPlayer player = new SongPlayer(rootGroup);
        player.getSongList(); // Play all types of songs.

    }


}
