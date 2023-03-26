package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.composite.songComponents;

import java.util.ArrayList;

/**
 * Group of songs.
 * Keep individual songs or groups of songs.
 */
public class SongGroup extends SongComponent {

    private final String groupName;
    private final String groupDescription;
    private final ArrayList<SongComponent> songComponent = new ArrayList<>(); // Contain single songs or groups of songs.

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * Get single song ({@link Song}) or group of song using {@link ArrayList} index.
     *
     * @param componentIndex {@link SongComponent} index in {@link ArrayList}.
     * @return {@link SongComponent}
     */
    public SongComponent getSongComponent(int componentIndex) {
        return this.songComponent.get(componentIndex);
    }

    /**
     * Add single songs ({@link Song}) or group of songs ({@link SongGroup}).
     *
     * @param songComponent Universal {@link SongComponent}.
     */
    public void add(SongComponent songComponent) {
        this.songComponent.add(songComponent);
    }

    /**
     * Remove single songs ({@link Song}) or group of songs ({@link SongGroup}).
     *
     * @param songComponent Universal {@link SongComponent}.
     */
    public void remove(SongComponent songComponent) {
        this.songComponent.remove(songComponent);
    }

    /**
     * Recursively displaying all child {@link SongComponent} in this group.
     */
    public void displaySongInfo() {
        System.out.println("\nFolder name: " + getGroupName() + ", description: " + getGroupDescription() + ".\n");
        for (SongComponent songComponent : this.songComponent) {
            songComponent.displaySongInfo();
        }
    }

}
