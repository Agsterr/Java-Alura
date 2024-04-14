package exercicios.contasBancarias;

public class ContaBancaria {
    int numeroDaConta;
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

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
