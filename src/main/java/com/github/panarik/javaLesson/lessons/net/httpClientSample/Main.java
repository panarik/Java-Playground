package com.github.panarik.javaLesson.lessons.net.httpClientSample;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {

    private static final String URL_API_POST = "https://jsonplaceholder.typicode.com/posts";

    public static void main(String[] args) throws IOException, InterruptedException {

        //создаём клиента
        HttpClient client = HttpClient.newHttpClient();

        //отправляем запрос
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(URL_API_POST))
                .build();

        //получаем ответ
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());

        //парсим JSON
        ObjectMapper mapper = new ObjectMapper();

        List<Post> posts = mapper.readValue(response.body(), new TypeReference<List<Post>>() {});

        posts.forEach(System.out::println);

    }

}
