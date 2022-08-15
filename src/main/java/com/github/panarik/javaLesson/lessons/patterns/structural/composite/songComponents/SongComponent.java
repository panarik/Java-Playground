package com.github.panarik.javaLesson.lessons.patterns.structural.composite.songComponents;

/**
 * Defines specific types of objects.
 * {@link SongComponent} can be two types: {@link SongGroup} and {@link Song}.
 */
public abstract class SongComponent {

    public void add(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleasedYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
