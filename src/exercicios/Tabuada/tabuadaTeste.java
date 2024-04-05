package exercicios.Tabuada;

import java.util.Scanner;

public class tabuadaTeste {
    public static void main(String[] args) {


        tabuadaMultiAplicacao tab = new tabuadaMultiAplicacao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que deseja iniciar a tabuada: ");
        int n = sc.nextInt();
        tab.mostrarTabuada(n);

    }
}
