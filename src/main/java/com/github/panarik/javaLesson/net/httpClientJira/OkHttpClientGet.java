package com.github.panarik.javaLesson.net.httpClientJira;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public interface OkHttpClientGet {

    String GET = "GET";
    String URL = "https://panariks.atlassian.net";
    String ISSUEPATH = "/rest/api/2/issue/";

    default void getIssue(String issueKey, String authToken) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(URL+ISSUEPATH+issueKey)
                .method(GET, null)
                .addHeader("Authorization", "Basic "+authToken)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();
        System.out.println(response);
        System.out.println(response.body().string());
    }

    default void getIssueHistory(String issueKey, String authToken) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(URL+ISSUEPATH+issueKey+"/changelog?startAt=0&maxResults=100")
                .method(GET, null)
                .addHeader("Authorization", "Basic "+authToken)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();
        System.out.println(response);
        System.out.println(response.body().string());
    }



}
