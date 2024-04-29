package exercicios.desafioBuscador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEndereco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        List<Endereco> listaDeEndereco = new ArrayList<>();

        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Buscar CEP");
            System.out.println("2. Gravar CEP");
            System.out.println("3. Apagar CEP");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite o CEP que deseja buscar: ");
                    String cepStr = scanner.nextLine();

                    try {
                        Endereco novoEndereco = consultaCep.buscaEndereco(cepStr);
                        System.out.println(novoEndereco);
                        listaDeEndereco.add(novoEndereco);
                        geradorDeArquivo.salvaEndereco(listaDeEndereco);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando a aplicação");
                    }
                    break;
                case 2:
                    // Implemente a gravação do CEP
                    break;
                case 3:
                    // Implemente a exclusão do CEP
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
