package com.github.panarik.javaLesson.lessons.patterns.structural.composite.songComponents;

public class Song extends SongComponent {

    private final String songName;
    private final String bandName;
    private final int yearReleased;

    public Song(String songName, String bandName, int yearReleased) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearReleased = yearReleased;
    }

    public void displaySongInfo() {
        System.out.println("Song title: " + songName + ", by: " + bandName + ", released in " + yearReleased+".");
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
