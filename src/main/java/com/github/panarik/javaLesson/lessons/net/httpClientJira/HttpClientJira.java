package com.github.panarik.javaLesson.lessons.net.httpClientJira;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientJira {

    private static final String URL_API_POST = "https://panariks.atlassian.net/rest/api/2/issue/TEST-1";

    public static void main(String[] args) {

        //создаём клиента
        HttpClient client = HttpClient.newHttpClient();

        //отправляем запрос
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(URL_API_POST))
                .header("Authorization", "")
                .build();
        System.out.println(request.toString());
        System.out.println(request.headers().toString());

        //получаем ответ
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        } finally {
            System.out.println(response.body());
        }




    }

}
