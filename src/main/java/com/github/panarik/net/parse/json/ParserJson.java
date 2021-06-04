package com.github.panarik.net.parse.json;

import com.github.panarik.net.parse.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParserJson {

    //
    public Root parse() {

        Root root = new Root();

        //создаем парсер
        JSONParser parser = new JSONParser();

        //читаем файлик
        try (FileReader reader = new FileReader("src/main/resources/test.json")) {

            //создаём рутовый объект из файлика JSON
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

            //получаем поле name рутового объекта JSON
            String name = (String) rootJsonObject.get("name");
            //записываем это поле в объект
            root.setName(name);
            return root;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
            System.out.println("Parsing error");
        }


        return null;
    }

}
