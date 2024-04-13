package br.com.alura.Principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {



        var filmeDoPaulo = new Filme("dogville", 2003);
        filmeDoPaulo.avalia(10);
        Filme meuFilme = new Filme("o poderoso chefão ", 1970);
        meuFilme.avalia(9);

        Filme filmee = new Filme("o chefão", 1970);
        filmee.avalia(6);
        Series lost = new Series("lost",2000);
        ArrayList <Titulos> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);

        listaDeFilmes.add(meuFilme);

        listaDeFilmes.add(filmee);
        listaDeFilmes.add(lost);
        for (Titulos listaDeFilme : listaDeFilmes) {

            System.out.println(listaDeFilme.getNome());
           //casting
           // Filme filme = (Filme) listaDeFilme;
           // System.out.println("classificação: " + filme.getClassificacao() );
           if (listaDeFilme instanceof Filme filme && filme.getClassificacao() > 2){
               System.out.println("classificação: " + filme.getClassificacao() );
           }

//            System.out.println("----------------------------------------------------");
//            listaDeFilmes.forEach(nome -> System.out.println(nome));
//            System.out.println("----------------------------------------------------");
//            listaDeFilmes.forEach(System.out::println);
        }


    }
}
