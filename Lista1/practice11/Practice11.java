package Start.Lista1.practice11;

/*
Make an algorithm that receives the cost price of a product and shows
the sale value. It is known that the cost price will receive an
increase according to a percentage entered by the user;
*/
import java.util.Scanner;

public class Practice11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the value product: ");
        double product = scanner.nextDouble();

        System.out.print("enter the percentage value of the increment %: ");
        double percentage = scanner.nextDouble();

        System.out.printf("New value product: %.2f", product * (1+(percentage/100)));            
        scanner.close();
        }
    
}
