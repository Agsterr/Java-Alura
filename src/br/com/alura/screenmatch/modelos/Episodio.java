package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.Calculadora.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Series series;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassificacao() {
        if (totalDeAvaliacoes > 100){
            return 4;
        }else {
            return 2;
        }

    }
}
