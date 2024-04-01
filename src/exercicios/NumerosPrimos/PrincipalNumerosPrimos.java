package exercicios.NumerosPrimos;

public class PrincipalNumerosPrimos {
    public static void main(String[] args) {


        VerificadorPrimo verificador = new VerificadorPrimo();

        if (verificador.verificarSeEhPrimo(17)) {
            System.out.println("17 é primo.");
        } else {
            System.out.println("17 não é primo.");
        }

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);
    }
}



