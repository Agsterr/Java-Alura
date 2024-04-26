package exercicios.PersitenciaDeDados;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.Scanner;

public class TituloTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Titulo titulo = new Titulo();
        System.out.println("digite o nome: ");
       titulo.nome = sc.nextLine();
        System.out.println("digite o ano: ");
        titulo.ano = sc.nextInt();
        System.out.println("digite a duração: ");
        titulo.duracaoEmMinutos = sc.nextDouble();
        Gson gson = new GsonBuilder()
                //evitar erro se receber arquivos com letra maiscula
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String jsonTeste = gson.toJson(titulo);
        System.out.println(jsonTeste);
    }
}
