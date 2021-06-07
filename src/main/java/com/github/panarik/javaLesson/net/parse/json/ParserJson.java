package com.github.panarik.javaLesson.net.parse.json;

import com.github.panarik.javaLesson.net.parse.model.People;
import com.github.panarik.javaLesson.net.parse.model.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserJson {

    private static final String TAG_NAME_MAIN = "name";
    private static final String TAG_PEOPLE = "people";
    private static final String TAG_ELEMENT = "element";
    private static final String TAG_NAME = "name";
    private static final String TAG_AGE = "age";

    //
    public Root parse() {

        Root root = new Root();

        //создаем парсер
        JSONParser parser = new JSONParser();

        //читаем файлик
        try (FileReader reader = new FileReader("src/main/resources/test.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader); //создаём рутовый объект из файлика JSON

            String name = (String) rootJsonObject.get(TAG_NAME_MAIN); //получаем поле name рутового объекта JSON
            JSONArray peopleJsonArray = (JSONArray) rootJsonObject.get(TAG_PEOPLE); //получаем ArrayList из JSON файлика


            List<People> peopleList = new ArrayList<>(); //создаём ArrayList в который будем складывать значения объектов из массива файлика JSON

            //проходим по массиву
            for(Object it: peopleJsonArray) {
                JSONObject currentJsonObject = (JSONObject) it;

                String namePeople = (String) currentJsonObject.get(TAG_NAME); //вытаскиваем поле с ключем name текущего объекта в списке
                long agePeople = (Long) currentJsonObject.get(TAG_AGE); //вытаскиваем поле с ключем age текущего объекта в списке

                People currentPeople = new People(namePeople, (int)agePeople);
                peopleList.add(currentPeople);
            }

            root.setName(name);
            root.setPeople(peopleList);

            return root;

        } catch (ClassCastException | IOException | ParseException e) {
            e.printStackTrace();
            System.out.println("Parsing error");
        }


        return null;
    }

}
