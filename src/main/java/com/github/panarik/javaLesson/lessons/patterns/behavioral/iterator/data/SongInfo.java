package com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator.data;

/**
 * Song class with data about song itself.
 */
public class SongInfo {

    private String songName;
    private String bandName;
    private int yearReleased;

    public SongInfo(String songName, String bandName, int yearReleased) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearReleased = yearReleased;
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

    public String toString() {
        return "SongInfo{" +
                "songName='" + songName + '\'' +
                ", bandName='" + bandName + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }

}
