package exercicios.desafioBuscador;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (IOException e) {
            System.out.println("Erro de E/S: " + e.getMessage());
            throw new RuntimeException("Erro de E/S ao buscar o endereço: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Erro de interrupção: " + e.getMessage());
            throw new RuntimeException("Erro de interrupção ao buscar o endereço: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro desconhecido: " + e.getMessage());
            throw new RuntimeException("Erro desconhecido ao buscar o endereço: " + e.getMessage());
        }
    }
}
