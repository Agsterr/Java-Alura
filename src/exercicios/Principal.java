package exercicios;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("sedan");
        carro.definirPrecos(23.000,26.000,29.000);

        carro.calculoDeAnoDoCarro();
System.out.printf("\n----------------------------------------------------------");
        Ferrari ferrari = new Ferrari();
        ferrari.definirModelo("ferrari");
        ferrari.definirPrecos(50.000,70.000,100.000);
        ferrari.calculoDeAnoDoCarro();


    }
}
