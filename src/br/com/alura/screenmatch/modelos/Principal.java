package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.Calculadora.Calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("o poderoso chefão ");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        Filme Filme = new Filme();

        Filme.setNome("o poderoso chefão ");
        Filme.setAnoLancamento(1970);
        Filme.setDuracaoEmMinutos(180);
        Filme.setIncluidoNoPlano(false);

        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.informacoes();
        System.out.println("aquiii: " + meuFilme.retorneMedia());

        Series lost = new Series();

        lost.setNome("lost");
        lost.setAnoLancamento(2000);
        lost.setEpisodiosPorTemporadas(10);
        lost.setSerieIncluidaNoPlano(false);
        lost.setMinutosPorEpisodios(10);
        lost.setTemporadas(10);

        Series grim = new Series();

        grim.setNome("grim");
        grim.setAnoLancamento(2000);
        grim.setEpisodiosPorTemporadas(10);
        grim.setSerieIncluidaNoPlano(false);
        grim.setMinutosPorEpisodios(10);
        grim.setTemporadas(10);

       
        Calculos calc = new Calculos();
        calc.incluiFilme(grim);
        calc.incluiFilme(lost);
        calc.incluiFilme(meuFilme);

        System.out.println("Total em minutos: " + calc.getTempoTotal());


    }
}