package br.com.alura.screenmatch.modelos.Calculadora;

public class FiltroDeRecomendacao {
    private String recmmendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.printf("Está entre os preferidos do momento");

        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito Bem Avaliado No Momento ");

        }else {
            System.out.println("Coloque Na Sua lista para assistir depois ");
        }
    }
}
