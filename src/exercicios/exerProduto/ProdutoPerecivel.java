package exercicios.exerProduto;

public class ProdutoPerecivel extends Produto{
 private int dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
}
