package com.github.panarik.javaLesson.net.httpClientJira;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class OkHttpClientJira {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Your Token>>>>>>");
        String token = scanner.next();

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://panariks.atlassian.net/rest/api/2/issue/TEST-1")
                .method("GET", null)
                .addHeader("Authorization", "Basic "+token)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();

        System.out.println(response);
        System.out.println(response.body().string());


    }

}
