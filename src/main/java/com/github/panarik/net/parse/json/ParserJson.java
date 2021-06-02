package com.github.panarik.net.parse.json;

import com.github.panarik.net.parse.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ParserJson {

    public Root parse() {

        //создаем парсер
        JSONParser parser = new JSONParser();

        //читаем файлик
        try (FileReader reader = new FileReader("test.json")) {
            //создаём рутовый объект из файлика JSON
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

            //получаем рутовое поле
            String name = (String) rootJsonObject.get("name");


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Parsing error");
        }


    }

}
