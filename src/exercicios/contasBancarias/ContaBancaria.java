package exercicios.contasBancarias;

public class ContaBancaria {
   private String nome;
   protected double saldo;


public double depositar(double deposito){
    return saldo += deposito;
}
    public double sacarDaConta(double saque){
        return this.saldo -= saque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
