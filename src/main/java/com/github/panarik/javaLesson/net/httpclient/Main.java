package com.github.panarik.javaLesson.net.httpclient;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

        System.out.println(response.body());
    }

}
