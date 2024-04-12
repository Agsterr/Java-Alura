package exercicios.exercicioPessoaArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class pessoaPrincipal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Scanner digite = new Scanner(System.in);


        System.out.println("Digite a quantidade de pessoas da lista: ");
        int n = digite.nextInt();
        digite.nextLine();

        for (int i = 0; i < n; i++) {
            Pessoa p = new Pessoa();
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");

            p.setNome(digite.next()) ;

            System.out.println("Digite o idade da pessoa " + (i + 1) + ": " );

            p.setIdade(digite.nextInt());
            listaDePessoas.add(p);
        }

        System.out.println("lista de pessoas: ");
        for (Pessoa ps : listaDePessoas){
            System.out.println("nome: " + ps.getNome() + " idade: " + ps.getIdade());
        }
        System.out.println("Tamanho Da Lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da listaa: "+ listaDePessoas.get(0));

        digite.close();

    }
}
