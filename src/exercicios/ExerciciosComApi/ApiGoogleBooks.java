package exercicios.ExerciciosComApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = leitura.nextLine();
        //substitui o espaço por %20
        String nomeDoLivroComEspaco = tituloLivro.replace(" ","%20");
        String chave = "AIzaSyBwjMMzKDMnB1Lfb64vlM9tG5h9MOvWz7I";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
