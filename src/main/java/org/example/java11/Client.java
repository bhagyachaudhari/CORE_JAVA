package org.example.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        String str = " " +
                "";
        System.out.println(str.isBlank());
        String s1 = "Hello" +
                "World";
        System.out.println(s1.lines().collect(Collectors.toList()));
        System.out.println(s1.repeat(2));
        String s2 = " aaaa  bbb  cccc  dddd  ";
        System.out.println(s2.strip());

        System.out.println(" ".isBlank());              // true
        System.out.println("Java\n11".lines().count()); // 2
        System.out.println(" Java ".strip());           // "Java"
        System.out.println("Java".repeat(3));           // "JavaJavaJava");

        //HttpClient httpClient = HttpClient.newBuilder().build();
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        List<Integer> list = List.of(1,2,4,5,7);
        System.out.println(list.stream().reduce((var x, var y) -> x + y).get());
    }
}
