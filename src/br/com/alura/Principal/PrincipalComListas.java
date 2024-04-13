package br.com.alura.Principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {



        var filmeDoPaulo = new Filme("dogville", 2003);

        Filme meuFilme = new Filme("o poderoso chefão ", 1970);


        Filme filme = new Filme("o chefão", 1970);

        Series lost = new Series("lost",2000);
        ArrayList <Titulos> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(lost);


    }
}
