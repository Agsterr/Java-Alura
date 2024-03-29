package exercicios;

public class Animal {

    private String nome;
    private String tipoDeAnimal;

    private boolean eMamifero;

    public void emitirSom(){
        System.out.printf("hahahahahah");

    }
    public void informacaoDoAnimal(Animal animal){
        System.out.printf("\nÉ memiro: "+eMamifero +"\nNome do animal: " +nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public boolean iseMamifero() {
        return eMamifero;
    }

    public void seteMamifero(boolean eMamifero) {
        this.eMamifero = eMamifero;
    }


}
