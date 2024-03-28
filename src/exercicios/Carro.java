package exercicios;

public class Carro {


    private String modeloDoVeiculo;
    private double precoDoVeiculoAno1;

    private double precoDoVeiculoAno2;
    private double precoDoVeiculoAno3;
    private double maior;
    private double menor;

   public void definirPrecos(double precoDoVeiculoAno1 ,double precoDoVeiculoAno2 , double precoDoVeiculoAno3){

       this.precoDoVeiculoAno1 = precoDoVeiculoAno1;
       this.precoDoVeiculoAno2 = precoDoVeiculoAno2;
       this.precoDoVeiculoAno3 = precoDoVeiculoAno3;
   }
   public void definirModelo(String modeloDoVeiculo){
       this.modeloDoVeiculo = modeloDoVeiculo;
   }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }




  public   void calculoDeAnoDoCarro(){


      double maior = Math.max(precoDoVeiculoAno1, Math.max(precoDoVeiculoAno2, precoDoVeiculoAno3));
      double menor = Math.min(precoDoVeiculoAno1, Math.min(precoDoVeiculoAno2, precoDoVeiculoAno3));
      System.out.printf("\nModelo Do Veiculo: " +getModeloDoVeiculo());
      System.out.printf("\nValor maior do carro: %.3f\nMenor valor: %.3f", maior, menor);



  }



    public double getPrecoDoVeiculoAno2() {
        return precoDoVeiculoAno2;
    }

    public void setPrecoDoVeiculoAno2(double precoDoVeiculoAno2) {
        this.precoDoVeiculoAno2 = precoDoVeiculoAno2;
    }

    public double getPrecoDoVeiculoAno3() {
        return precoDoVeiculoAno3;
    }

    public void setPrecoDoVeiculoAno3(double precoDoVeiculoAno3) {
        this.precoDoVeiculoAno3 = precoDoVeiculoAno3;
    }




    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public double getPrecoDoVeiculoAno1() {
        return precoDoVeiculoAno1;
    }

    public void setPrecoDoVeiculoAno1(double precoDoVeiculoAno1) {
        this.precoDoVeiculoAno1 = precoDoVeiculoAno1;
    }
}
