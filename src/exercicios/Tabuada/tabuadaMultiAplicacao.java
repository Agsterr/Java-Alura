package exercicios.Tabuada;

import java.util.Scanner;

public class tabuadaMultiAplicacao implements tabuada{
    int resultado =0;

   Scanner digite = new Scanner(System.in);
    @Override
    public void mostrarTabuada(int numero ) {
        for (int i = 1; i <= 10; i++) {
            // Calcula o resultado da multiplicação
            int resultado = numero * i;
            // Exibe o resultado na tela
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

       }




