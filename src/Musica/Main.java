package Musica;

public class Main {
    public static void main(String[] args) {
        Musica dados = new Musica("Morango do nordeste", "fala mansa", 2000);
        dados.avaliar(7);
        dados.avaliar(9);
        dados.calcularMediaAvaliacoes();
        dados.exibirFichaTecnica();
    }



}
