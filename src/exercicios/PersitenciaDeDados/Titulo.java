package exercicios.PersitenciaDeDados;

import java.util.Scanner;

public class Titulo {


        String nome;
        Double duracaoEmMinutos;
        int ano;

        @Override
        public String toString() {
                return "Titulo{" +
                        "nome='" + nome + '\'' +
                        ", duracaoEmMinutos=" + duracaoEmMinutos +
                        ", ano=" + ano +
                        '}';
        }
}
