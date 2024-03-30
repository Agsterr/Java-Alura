package exercicios.contasBancarias;

public class ContaCorrente extends ContaBancaria {




        private static final double TARIFA_MENSAL = 1.0; // Definindo a tarifa mensal como uma constante

        public void cobrarTarifaMensal() {
            double tarifa = getSaldo() * (TARIFA_MENSAL / 100.0); // Calculando a tarifa como uma porcentagem do saldo
            saldo -= tarifa; // Deduzindo a tarifa do saldo
        }



}
