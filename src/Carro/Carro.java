package Carro;

import java.util.Scanner;

public class Carro {
    String nome;
    String marca;
    int ano;
    String modelo;


    public void imprmirinformacoes(){
        System.out.println("Nome do carro: " + nome);
        System.out.println("Marca do carro: " + marca);
        System.out.println("ano do carro: " + ano);
        System.out.println("Modelo Do carro: " + modelo);

    }
    public void lerinformacoesdocarro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do seu carro: ");
        nome = ler.next();
        System.out.println("Qual marca seria o seu carro?: ");
        marca = ler.next();
        System.out.println("Qual o modelo do seu carro?: ");
        modelo = ler.next();
        System.out.println("Qual o ano do seu carro?: ");
        ano = ler.nextInt();
    }
}
