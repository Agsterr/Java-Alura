package exercicios.PersitenciaDeDados;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteCriaçãoDearquivo {
    public static void main(String[] args) throws IOException {

        Scanner escreva = new Scanner(System.in);
        String texto = escreva.nextLine();
        FileWriter fileWriter = new FileWriter("arquivo.txt");
        fileWriter.write(texto);
        fileWriter.close();
        System.out.println(texto);
    }
}
