package Calculadora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um numero:");
        double numero = ler.nextDouble();
        Calculadora calculo = new Calculadora();
        double resultado = calculo.dobrar(numero);
        System.out.println("O dobro é:" + resultado);
    }
}
