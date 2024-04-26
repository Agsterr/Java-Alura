package br.com.alura.Principal;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.modelos.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        busca = busca.replace(" ", "%20");

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=7d01bb64";
        try {


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            // variavel json recebendo o arquivo json
            String json = response.body();

            // instanciando a classe gson
            Gson gson = new GsonBuilder()
                    //evitar erro se receber arquivos com letra maiscula
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            //  instanciando a classe record  e fazendo a conversão do arquivo json na classe record
            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(tituloOmdb);

            // instanciando classe super Titulo e passando a classe record como parametro (tituloOmdb)
            Titulos titulos = new Titulos(tituloOmdb);
            System.out.println(titulos);
        }catch (NumberFormatException   e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());

        }catch ( IllegalArgumentException  e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("aconteceu um erro não sei oque pode ser");
        }
        System.out.println("Finalizou corretamente!!!");


    }
}
