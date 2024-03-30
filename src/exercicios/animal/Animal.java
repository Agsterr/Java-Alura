package exercicios.animal;

public class Animal {

    private String nome;
    private String tipoDeAnimal;

    private boolean eMamifero;




    private String somEmitido;

    public void emitirSom(){
        System.out.printf("\nSom emitido: " );

    }
    public void informacaoDoAnimal(Animal animal){
        System.out.printf("\nÉ memiro: "+eMamifero +
                "\nNome do animal: " +nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void seteMamifero(boolean eMamifero) {
        this.eMamifero = eMamifero;
    }


}
