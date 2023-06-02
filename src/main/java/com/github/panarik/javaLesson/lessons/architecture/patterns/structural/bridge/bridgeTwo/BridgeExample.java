package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo;


import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.themes.DarkTheme;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.webPages.HomeWebPage;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.themes.LightTheme;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.bridge.bridgeTwo.webPages.WebPage;

import java.util.ArrayList;
import java.util.List;

public class BridgeExample {


    public static void main(String[] args) {

        List<WebPage> pages = new ArrayList<>();
        pages.add(new HomeWebPage(new LightTheme()));
        pages.add(new HomeWebPage(new DarkTheme()));

        for (WebPage page : pages) {
            page.getPage();
        }

    }


}
