package exercicios.exercicioPessoaArrays;

public class Titulo implements Comparable<Titulo> {
     String nome;
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Método compareTo para ordenação
    @Override
    public int compareTo(Titulo outro) {

        return this.nome.compareToIgnoreCase(outro.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome ;
    }
}
