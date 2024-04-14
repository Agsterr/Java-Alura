package exercicios.contasBancarias;

import java.util.ArrayList;

public class PrincipalConta {
    public static void main(String[] args) {
           ContaBancaria contaBancaria = new ContaBancaria();
           contaBancaria.depositar(2000.00);
           contaBancaria.sacarDaConta(300);
           contaBancaria.numeroDaConta =1;
           System.out.printf("Saldo Da conta bancaria: " + contaBancaria.getSaldo());


        ContaBancaria contaBancaria2 = new ContaBancaria();
        contaBancaria2.depositar(5000.00);
        contaBancaria2.sacarDaConta(300);
        contaBancaria2.numeroDaConta = 2;
        System.out.printf("Saldo Da conta bancaria: " + contaBancaria2.getSaldo());

           ContaCorrente contaCorrente = new ContaCorrente();
           contaCorrente.depositar(4000);
           contaCorrente.numeroDaConta = 3;
           contaCorrente.cobrarTarifaMensal();
        System.out.printf("\nSaldo Da Corrente: %.3f\n " , contaCorrente.getSaldo());
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(contaBancaria2);
        listaDeContas.add(contaCorrente);
        listaDeContas.add(contaBancaria2);
        double saldoMaximo = 0;
        int numeroDaCaontaComSaldoMaior = 0;
        for (ContaBancaria SaldoConta : listaDeContas) {
            if (SaldoConta.getSaldo() > saldoMaximo){
                saldoMaximo = SaldoConta.getSaldo();
                numeroDaCaontaComSaldoMaior = SaldoConta.numeroDaConta;
            }


        }
        System.out.println("Numero da conta com maior saldo: " + numeroDaCaontaComSaldoMaior );
        System.out.println("Saldo mais alto das contas: " + saldoMaximo);

    }
}
