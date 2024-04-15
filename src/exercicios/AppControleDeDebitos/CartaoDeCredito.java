package exercicios.AppControleDeDebitos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito implements strato {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }



    @Override
    public void visualizarCompras() {
        if (!compras.isEmpty()) {
            System.out.println("Lista de Compras:");
            for (Compra compra : compras) {
                System.out.println(compra);
            }
        } else {
            System.out.println("A lista de compras está vazia.");
        }
    }
    public void ordenarComprasPorValor(){
        Collections.reverse(compras);
    }
}
