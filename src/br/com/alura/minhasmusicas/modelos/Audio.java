package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;
    public int getClassificacao() {
        return classificacao;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }



    public void curtir(){
        this.totalCurtidas ++;

    }
    public void reproduz(){
        this.totalReproducoes ++;
    }

}
