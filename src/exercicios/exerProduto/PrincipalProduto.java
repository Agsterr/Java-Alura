package exercicios.exerProduto;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalProduto {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidadeProdutos = digite.nextInt();
        digite.nextLine(); // Limpar o buffer do scanner

        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto produto = new Produto();
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            produto.setNome(digite.nextLine());
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            double preco = digite.nextDouble();
            produto.setPreco(preco);
            System.out.println("Digite a quantidade do produto " + (i + 1) + ": ");
            int quantidade = digite.nextInt();
            produto.setQuantidade(quantidade);
            digite.nextLine(); // Limpar o buffer do scanner após o nextInt()
            produtos.add(produto);
        }

        System.out.println("Quantidade de produtos na lista: " + produtos.size());
        System.out.println("Primeiro produto da lista: " + produtos.get(0));
        System.out.println("Lista de produtos: ");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
