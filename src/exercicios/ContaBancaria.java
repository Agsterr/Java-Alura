package exercicios;

public class ContaBancaria {
   private String nome;
   private double saldo;



    public double sacarDaConta(double saque){
        return this.saldo - saque;
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
