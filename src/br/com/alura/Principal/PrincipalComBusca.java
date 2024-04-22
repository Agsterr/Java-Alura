package br.com.alura.Principal;

import br.com.alura.screenmatch.modelos.Titulos;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = leitura.nextLine();
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=7d01bb64";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);
        Gson gson = new Gson();
        Titulos titulos = gson.fromJson(json, Titulos.class);
        System.out.println(titulos);
    }
}
