public class Filme {

    String nome;
    int anoLancamento;

    int duracaoEmMinutos;
    double somaDasAvaliacoes;
    double mediaDasAvaliacoes;

    double totalDeAvaliacoes;
    void informacaoDoFilme(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme: " + anoLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
        System.out.println("Avaliação do filme: " + somaDasAvaliacoes);
        System.out.println("Total De Avaliações: " + totalDeAvaliacoes);
        System.out.println("Media De Avaliação: " + retorneMedia());
    }

    void avalia(double nota){

        somaDasAvaliacoes += nota;

        totalDeAvaliacoes ++;
    }

    double retorneMedia(){
        double media = 0;
        media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
