package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.webPages;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.themes.Theme;

public abstract class WebPage {

    /**
     * This is a bridge. We connect all pages to all themes.
     * Each web page should have some theme: Light, Dark, Aqua.
     */
    private Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    public void getPage() {
        System.out.println("Page with " + theme.getColor());
    }

}
