package com.company;

public class Main {

    public static void main(String[] args) {
        leituraJavaate8();
//        leituraJava11();
    }

//    private static void leituraJava11() throws Exception{
//        HttpClient cliente = HttpClient.newBuilder().build();
//        HttpClient request = HttpRequest.newBuild()
//                .GET()
//                .uri(URI.create("https://viacep.com.br/ws/04735002/json/"))
//                .build();
//        HttpRespose<String> response = cliente.send(request,
//                HttpResponse.BodyHandlers.ofString());
//        System.out.println("Status Code:" + response.statusCode());
//        System.out.println("Recebidos:");
//        System.out.println(response.body());
//    }

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

    }
}
