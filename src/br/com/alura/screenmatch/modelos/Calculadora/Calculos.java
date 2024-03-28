package br.com.alura.screenmatch.modelos.Calculadora;

import br.com.alura.screenmatch.modelos.Titulos;

public class Calculos {


    private int tempoTotal;
    public int getTempoTotal() {
        return tempoTotal;



    }

    public void incluiFilme(Titulos t){
       this.tempoTotal += t.getDuracaoEmMinutos();

    };


}
