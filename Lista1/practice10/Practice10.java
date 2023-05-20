
/*
The Papaya with Sugar Store is selling its products in 5 (five)
interest freeinstallments. Make an algorithm that receives a value of a
purchase and shows the value of installments;
*/


import java.util.Scanner;

public class Practice10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the valor product: ");
        double valor = scanner.nextDouble();

        System.out.printf("installments\n");

        for(int i = 1; i<= 5; i++){
            System.out.printf("%d  - %.2f\n",i,valor);   
        }
        scanner.close();
    }
    
}
