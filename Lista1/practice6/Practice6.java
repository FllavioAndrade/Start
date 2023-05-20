
/*
Read two values ​​for variables A and B, and change the values ​​so that
variable A will have the value of variable B and variable B will have
the value of variable A. Display the changed values;
 */

import java.util.Scanner;
public class Practice6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first valor: ");
        int valorA = scanner.nextInt();

        System.out.print("Enter secound valor: ");
        int ValorB = scanner.nextInt();

        System.out.printf("sequential normal: %d %d",valorA,ValorB);
        int aux = valorA;
        valorA = ValorB;
        ValorB = aux;

        System.out.printf("sequential inverted: %d %d",valorA,ValorB);
        scanner.close();
    }
    
}
