package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.Calculadora.Calculos;
import br.com.alura.screenmatch.modelos.Calculadora.FiltroDeRecomendacao;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("o poderoso chefão ", 1970);


        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        Filme filme = new Filme("o chefão", 1970);

        filme.setNome("o chefão ");
        filme.setAnoLancamento(1970);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(false);

        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.informacoes();
        System.out.println("aquiii: " + meuFilme.pegaMedia());

        Series lost = new Series("lost",2000);


        lost.setEpisodiosPorTemporadas(10);
        lost.setSerieIncluidaNoPlano(false);
        lost.setMinutosPorEpisodios(10);
        lost.setTemporadas(10);

        Series grim = new Series("grim", 2000);


        grim.setEpisodiosPorTemporadas(10);
        grim.setSerieIncluidaNoPlano(false);
        grim.setMinutosPorEpisodios(10);
        grim.setTemporadas(10);

       
        Calculos calc = new Calculos();
        calc.incluiFilme(grim);
        calc.incluiFilme(lost);
        calc.incluiFilme(meuFilme);

        System.out.println("Total em minutos: " + calc.getTempoTotal());

        FiltroDeRecomendacao filtroDeRecomendacao = new FiltroDeRecomendacao();
        filtroDeRecomendacao.filtro(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setSeries(lost);
        episodio.setNumero(1);
        episodio.setTotalDeAvaliacoes(300);
        filtroDeRecomendacao.filtro(episodio);

        var filmeDoPaulo = new Filme("dogville", 2003);
        filmeDoPaulo.setNome("dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoLancamento(2003);
        filmeDoPaulo.avalia(10);
        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme);
        System.out.println("Tamanho Da Minha Lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme.: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }
}

