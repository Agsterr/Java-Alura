package exercicios.animal;

import exercicios.animal.Animal;

public class Gato extends Animal {

    public boolean acaoGato;

    public boolean isAcaoGato() {
        return acaoGato;
    }

    public void setAcaoGato(boolean acaoGato) {
        this.acaoGato = acaoGato;
    }

    public void emitirSom(){
        System.out.printf("\nSom emitido: ");
        System.out.printf("Miado");
    }
    public void arranharMoveis(){
        if (acaoGato == true){
            System.out.printf("\nO gato esta arranhando os moveis !!!");
        }else {
            System.out.printf("\nO gato não esta arranhando os moveis !!!");

        }

    }
    public void arranhar(){
        acaoGato = true;
    }
    public void pararDeArranhar(){
        acaoGato = false;

    }
}
