package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.minhasPreferidas;

public class Principal {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("Forever");
        musicas.setCantor("Kiss");

        for (int i = 0; i < 1000 ; i++) {
            musicas.reproduz();

        }
        for (int i = 0; i < 50; i++) {

         musicas.curtir();
        }


        Podcast podcast = new Podcast();
       podcast.setTitulo("bolhadev");
       podcast.setApresentador("Marcus mendes");

        for (int i = 0; i < 5000 ; i++) {
            podcast.reproduz();


        }

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }

        minhasPreferidas pref = new minhasPreferidas();
        pref.inclui(podcast);
        pref.inclui(musicas);

    }

}
