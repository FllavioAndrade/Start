package Start.POO.IMC;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa();

        System.out.println("Digite o peso da Pessoa");
        objetoPessoa.setPeso(scanner.nextFloat());
        System.out.println("Digite a altura da Pessoa");
        objetoPessoa.setAltura(scanner.nextFloat());

        scanner.close();

        System.out.println("IMC =" + objetoPessoa.calcularIMC());
    }
}