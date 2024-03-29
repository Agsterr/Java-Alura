package exercicios;

public class Principal {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();
        cachorro.setNome("cachorro");
        cachorro.seteMamifero(true);
        cachorro.informacaoDoAnimal(cachorro);
        cachorro.emitirSom();


System.out.printf("\n---------------------------------------------------");
        Gato gato = new Gato();
        gato.setNome("gato");
        gato.seteMamifero(true);
        gato.informacaoDoAnimal(gato);
        gato.emitirSom();

    }
}
