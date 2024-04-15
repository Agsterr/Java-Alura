package exercicios.AppControleDeDebitos;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CompraPrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Compra compra;
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(4000);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Essas são as suas opções: ");
            System.out.println("1-Comprar\n2-Consultar o saldo\n3-Consultar extrato do cartão\n4-Sair\n");
            System.out.println("Digite Qual opção você deseja: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o que você está comprando: ");
                String descricao = sc.next();
                System.out.println("Digite o valor da compra:");
                double valor = sc.nextDouble();
                compra = new Compra(descricao, valor);
                cartaoDeCredito.lancaCompra(compra);
            } else if (opcao == 2) {
                System.out.println("Saldo da conta: " + cartaoDeCredito.getSaldo());
            } else if (opcao == 3) {
                cartaoDeCredito.ordenarComprasPorValor();
                cartaoDeCredito.visualizarCompras();
            } else if (opcao == 4) {
                System.out.println("Seu limite: " + cartaoDeCredito.getLimite());
                System.out.println("Saldo: " + cartaoDeCredito.getSaldo());
            }
        }
        sc.close();
    }
}