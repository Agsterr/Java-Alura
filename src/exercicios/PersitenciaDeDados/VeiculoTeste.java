package exercicios.PersitenciaDeDados;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class VeiculoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Veiculo veiculo = new Veiculo() ;

        System.out.println("digite a marca do veiculo: ");
        veiculo.marca = sc.nextLine();

        System.out.println("digite o ano do veiculo: ");
        veiculo.ano = sc.nextDouble();

        Gson gson = new GsonBuilder()
                //evitar erro se receber arquivos com letra maiscula
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String dadosDoVeiculo = gson.toJson(veiculo);

        System.out.println("Dados do veiculo: " + dadosDoVeiculo);
    }
}
