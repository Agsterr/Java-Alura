package exercicios.exercicioInterfaceForma;

import java.util.ArrayList;

public class PrincipalForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listasDeFormas = new ArrayList<>();

        listasDeFormas.add(circulo);
        listasDeFormas.add(quadrado);

        for (Forma forma : listasDeFormas) {

            System.out.println("Area: " + forma.calcularArea());

        }


    }
}
