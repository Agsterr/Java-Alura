package exercicios.contasBancarias;

public class PrincipalConta {
    public static void main(String[] args) {
           ContaBancaria contaBancaria = new ContaBancaria();
           contaBancaria.depositar(2000.00);
           contaBancaria.sacarDaConta(300);
           System.out.printf("Saldo Da conta bancaria: " + contaBancaria.getSaldo());

           ContaCorrente contaCorrente = new ContaCorrente();
           contaCorrente.depositar(4000);
           contaCorrente.cobrarTarifaMensal();
        System.out.printf("\nSaldo Da Corrente: %.3f\n " , contaCorrente.getSaldo());

    }
}
