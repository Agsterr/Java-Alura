package exercicios.ConversorDeMoeda;

public class ConversorMoeda implements ConversaoFinanceira{

    public double getTotal() {
        return total;
    }

    double total;
    @Override
    public double converterDolarParaReal(double valor) {
        this.total += valor * 5.00;

        return total;
    }

    @Override
    public String toString() {
        return "ConversorMoeda{" +
                "total=" + total +
                '}';
    }
}
