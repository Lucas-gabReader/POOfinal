package Carro;

public class Main {

    public static void main(String[] args) {
        Carro car = new Carro("minivan", 2005, "azul");
        car.exibirFichaTecnica();
        System.out.println("Idade do carro: " + car.calcularIdade(2024));
    }
}
