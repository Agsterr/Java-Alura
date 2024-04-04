package exercicios.ConversorDeMoeda;

public class ConversorDeMoedaTeste {

    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(200);
        System.out.printf("Valor Em Reais: " + conversorMoeda.getTotal());
    }
}
