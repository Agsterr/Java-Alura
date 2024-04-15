package exercicios.exercicioPessoaArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
            System.out.println(ps);
        }
        System.out.println("Tamanho Da Lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da listaa: "+ listaDePessoas.get(0));

        // exercicio1
        ArrayList <Integer> integers= new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        Collections.sort(integers);
        System.out.println("lista crescente: " + integers);
        System.out.println("---------------------------------------------");

        Collections.reverse(integers);
    System.out.println("lista descrescente: " + integers);

    //exercicio2 , 3

     Titulo titulo = new Titulo("");
        titulo.nome = "Jessica";
        Titulo titulo1 = new Titulo("");
        titulo1.nome = "Agster";
        Titulo titulo2 = new Titulo("");
        titulo2.nome = "gui";
        List<Titulo> nomes = new ArrayList<>();
        nomes.add(titulo1);
        nomes.add(titulo2);
        nomes.add(titulo);
        Collections.sort(nomes);
        System.out.println(nomes);
        for (Titulo nome : nomes) {
            System.out.println(nome.getNome());
        }


        digite.close();

    }
}
