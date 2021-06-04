package com.github.panarik.net.parse.json;

import com.github.panarik.net.parse.model.Root;

public class Main {

    public static void main(String[] args){
        ParserJson parser = new ParserJson();
        Root root = parser.parse();

        System.out.println("Root: "+ root.toString());
        System.out.println("People #1: "+root.getPeople().get(0));
        System.out.println("People #1: "+root.getPeople().get(1));

    }

}
