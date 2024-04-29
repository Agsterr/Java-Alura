package exercicios.desafioBuscador;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEndereco {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Endereco>  listaDeEndereco = new ArrayList<>();
        Gson gson = new GsonBuilder()
               // .setFieldNamingPolicy(FieldNamingPolicy
                        //.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Buscar CEP");
            System.out.println("2. Gravar CEP");
            System.out.println("3. Apagar CEP");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite o CEP que deseja buscar: ");
                    String cepStr = scanner.nextLine();

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://viacep.com.br/ws/" + cepStr + "/json/"))
                                .build();

                        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());



                        String json = response.body();
                        Endereco endereco = gson.fromJson(json, Endereco.class);

                        System.out.println(endereco);
                        listaDeEndereco.add(endereco);
                        FileWriter fileWriter = new FileWriter("listaDeEndeço.json");
                        fileWriter.write(gson.toJson(listaDeEndereco));
                        fileWriter.close();
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro ao fazer a requisição: " + e.getMessage());
                    }
                    break;
                case 2:

                    break;
                case 3:
                    // Implemente a exclusão do CEP
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);


        scanner.close();
    }
}
