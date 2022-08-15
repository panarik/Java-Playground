package com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.iterator.data.SongInfo;

import java.util.Iterator;

/**
 * Provides each class to have {@link Iterator}.
 */
public interface SongsIterator {

    Iterator<SongInfo> createIterator();

}
