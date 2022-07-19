package trilha.alura.imersaojava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class MovieStickers {
    public MovieStickers() throws IOException, InterruptedException {

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //pegar dados imdb
        //fazer uma conexão HTTP  e buscar os top 250 filmes
        String url = "https://alura-imdb-api.herokuapp.com/movies";
        URI uri = URI.create(url);
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        //extrair somente dados importantes
        //(titulo, poster, classificação)
        //exibir e manipular os dados
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        for (Map<String, String> listaDeFilme : listaDeFilmes) {
            System.out.println(listaDeFilme.get("title"));
            System.out.println(listaDeFilme.get("rank"));
        }
//        System.out.println(listaDeFilmes.size());
//        System.out.println(listaDeFilmes.get(0).get("title"));
    }
}
