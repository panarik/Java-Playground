package com.github.panarik.javaLesson.lessons.net.httpClientJira;

import java.io.IOException;
import java.util.Scanner;

public class OkHttpClientJira implements OkHttpClientGet {

    private static String authToken;
    private static final String issueKey = "TEST-1";

    public static void main(String[] args) throws IOException {

        OkHttpClientGet client = new OkHttpClientGet() {
            @Override
            public void getIssue(String issueKey, String authToken) throws IOException {
                OkHttpClientGet.super.getIssue(issueKey, authToken);
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Your Token>>>>>>");
        authToken = scanner.next();

//        client.getIssue(issueKey, authToken);
//        client.getIssueHistory(issueKey, authToken);
        client.getIssues(authToken);

    }



}
