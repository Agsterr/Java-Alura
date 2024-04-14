package exercicios.exerProduto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalProduto {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);
        digite.useLocale(Locale.US);
        ArrayList<Produto> produtos = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidadeProdutos = digite.nextInt();
        digite.nextLine(); // Limpar o buffer do scanner

        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto produto = new Produto("sal",7.1,1 );
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
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("goiaba",7.8,2);
        System.out.println();
        System.out.println("Produtos pereciveis: " + produtoPerecivel);
        System.out.println();

        System.out.println("Quantidade de produtos na lista: " + produtos.size());
        System.out.println("Primeiro produto da lista: " + produtos.get(0));
        System.out.println("Lista de produtos: ");

// exercicio 4
        double valorTotal = 0;
        int quantidadeTotal = 0;
        for (Produto produto : produtos) {

           valorTotal += produto.getPreco() * produto.getQuantidade();
           quantidadeTotal += produto.getQuantidade() ;

        }
        double precoMedio = 0;
        if (quantidadeTotal != 0) {
            precoMedio = valorTotal / quantidadeTotal;
        }
        System.out.println("Lista de produtos: " + produtos);
        System.out.println("valor total: " + valorTotal);
        System.out.println("Preço medio: " + precoMedio );
    }
}
