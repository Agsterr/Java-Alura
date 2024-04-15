package br.com.alura.screenmatch.modelos;

public class Series extends Titulos {

    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodios;

    public Series(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public boolean isSerieIncluidaNoPlano() {
        return serieIncluidaNoPlano;
    }

    public void setSerieIncluidaNoPlano(boolean serieIncluidaNoPlano) {
        this.serieIncluidaNoPlano = serieIncluidaNoPlano;
    }

    boolean serieIncluidaNoPlano;
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public void informacoes() {
        System.out.println("Nome da Série: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("Quantidade De Temporadas: " + getTemporadas());
        System.out.println("Duração Em Minutos De Cada Episódio: " + getMinutosPorEpisodios());
        System.out.println("Duração Total Em Minutos: " + getDuracaoEmMinutos());
        if (serieIncluidaNoPlano == true) {
            System.out.println("Esta incluso no plano!!!");
        }else {
            System.out.println("Não esta incluido no plano!!!");
        }
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;

    }

    @Override
    public String toString() {
        return " Nome: " + getNome() + " ano de lançamento: " + getAnoLancamento();
    }
}
