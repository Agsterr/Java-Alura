package exercicios.animal;

import exercicios.animal.Cachorro;
import exercicios.animal.Gato;

import java.util.ArrayList;
import java.util.concurrent.Callable;

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


       // exercicio:1 arrays
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("agster");
        nomes.add("jessica");
        nomes.add("aferson");
        nomes.add("lorrayne");

        for (String nome : nomes) {
            System.out.println(nome);
        }
/////////////////////////////////////////////////////////////////////////
        // exercicio2

        Cachorro c1 = new Cachorro();
       // Animal animal = (Animal) c1;

        if (c1 instanceof Animal animal){
            System.out.println("verdadeiro!!!!");
        }

        Animal an = new Animal();
        Cachorro c = (Cachorro) an;
///////////////////////////////////////////////////////////////////////////////////////

    }


}
