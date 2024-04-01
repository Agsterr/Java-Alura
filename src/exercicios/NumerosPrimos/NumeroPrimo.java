package exercicios.NumerosPrimos;

public class NumeroPrimo {

    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        // Percorrendo os possíveis divisores de 2 até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se encontrar um divisor, não é primo
            }
        }
        return true; // Se nenhum divisor foi encontrado, é primo
    }

    // Método para encontrar o próximo número primo após o número atual
    public int encontrarProximoPrimo(int numeroAtual) {
        int proximoPrimo = numeroAtual + 1;
        while (!verificarPrimalidade(proximoPrimo)) {
            proximoPrimo++;
        }
        return proximoPrimo;
    }
}

