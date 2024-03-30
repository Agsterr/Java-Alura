package exercicios.animal;

import exercicios.animal.Cachorro;
import exercicios.animal.Gato;

public class Principal {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();
        cachorro.setNome("cachorro");
        cachorro.seteMamifero(true);
        cachorro.informacaoDoAnimal(cachorro);
        cachorro.emitirSom();
        cachorro.pararDePerseguirOrabo();
        cachorro.perseguirRabo();
        cachorro.estaPerseguindoOrabo();



System.out.printf("\n---------------------------------------------------");
        Gato gato = new Gato();
        gato.setNome("gato");
        gato.seteMamifero(true);
        gato.informacaoDoAnimal(gato);
        gato.pararDeArranhar();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}