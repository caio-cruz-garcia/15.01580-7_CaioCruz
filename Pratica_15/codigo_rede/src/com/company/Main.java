package com.company;

import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        leituraJavaate8();
        leituraJava11();
    }

    private static void leituraJava11() throws Exception{
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("api.magicthegathering.io/v1/cards"))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Recebidos:");
        System.out.println(response.body());
    }

    private static void leituraJavaate8() throws Exception{
        URL url = new URL("https://api.pokemontcg.io/v1/cards");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int statusCode = con.getResponseCode();
        System.out.println("Status Code:" + statusCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        con.getInputStream()
                )
        );

        String result;
        StringBuffer content = new StringBuffer();
        while ((result = in.readLine()) != null){
            content.append(result);
        }
        in.close();
        System.out.println("Recebidos:");
        System.out.println(content);
    }
}
