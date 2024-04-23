package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulos implements Comparable<Titulos> {

    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private double mediaDasAvaliacoes;

    public Titulos(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().replace(" min", ""));
    }

    public Titulos(String nome, int anoLancamento) {
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getMediaDasAvaliacoes() {
        return mediaDasAvaliacoes;
    }

    private double totalDeAvaliacoes;
    public void informacoes(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme: " + anoLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
        System.out.println("Avaliação do filme: " + somaDasAvaliacoes);
        System.out.println("Total De Avaliações: " + totalDeAvaliacoes);
        System.out.println("Media De Avaliação: " + pegaMedia());
        System.out.println("Esta incluido no plano?: " + incluidoNoPlano);
    }



    public void avalia(double nota){

        somaDasAvaliacoes += nota;

        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        mediaDasAvaliacoes = 0;
        mediaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
        return mediaDasAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }


    @Override
    public int compareTo(Titulos outroTitulo) {

        return this.getNome().compareTo(outroTitulo.getNome()) ;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento + "," + "Duração em minutos: " + duracaoEmMinutos ;
    }
}
