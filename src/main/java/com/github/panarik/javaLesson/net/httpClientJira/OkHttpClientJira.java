package com.github.panarik.javaLesson.net.httpClientJira;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class OkHttpClientJira implements OkHttpClientGet {

    private static String authToken;
    private static final String issueKey = "TEST-1";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Your Token>>>>>>");
        authToken = scanner.next();

//        getIssue(issueKey);
        getIssueHistory(issueKey);

    }

    private static void getIssueHistory(String issueKey) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://panariks.atlassian.net/rest/api/2/issue/"+issueKey+"/changelog?startAt=0&maxResults=100")
                .method("GET", null)
                .addHeader("Authorization", "Basic "+authToken)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();

        System.out.println(response);
        System.out.println(response.body().string());
    }

    private static void getIssue(String issueKey) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://panariks.atlassian.net/rest/api/2/issue/"+issueKey)
                .method("GET", null)
                .addHeader("Authorization", "Basic "+authToken)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();

        System.out.println(response);
        System.out.println(response.body().string());
    }

}
