package exercicios.CalculadoraSalaRetangularex;

public class TesteCalculadoraSalaRetangular {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        calculadoraSalaRetangular.calcularArea(10 , 10);
        calculadoraSalaRetangular.calcularPerimetro(10 , 10);
        System.out.println("Area : " + calculadoraSalaRetangular.getArea()+ "\nPerimetro: " + calculadoraSalaRetangular.getPerimetro());
    }


}
