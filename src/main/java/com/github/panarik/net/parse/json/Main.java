package com.github.panarik.net.parse.json;

import com.github.panarik.net.parse.model.Root;

public class Main {

    public static void main(String[] args){
        ParserJson parser = new ParserJson();
        Root root = parser.parse();

        System.out.println("Root: "+ root.toString());

    }

}
