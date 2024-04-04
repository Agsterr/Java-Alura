package exercicios.CalculadoraSalaRetangularex;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
   private double area ;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public double calcularArea(double comprimento , double largura) {
         this.area = 0;
        return this.area += comprimento * largura ;
    }

    @Override
    public double calcularPerimetro(double comprimento , double largura) {
         this.perimetro =0;
        return this.perimetro += 2 * (comprimento + largura);
    }
}
