package Musica;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0.0;
        this.numAvaliacoes = 0;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numAvaliacoes);
    }

    public void avaliar(double nota) {
        this.avaliacao = ((this.avaliacao * this.numAvaliacoes) + nota) / (this.numAvaliacoes + 1);
        this.numAvaliacoes++;
    }

    public double calcularMediaAvaliacoes() {
        if (numAvaliacoes == 0) {
            return 0.0;
        }
        return avaliacao;
    }
}

