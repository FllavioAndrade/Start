package Start.Lista1.practice1;

//make a algoritmo that reiceve two numbers and display the result of your sum. 

import java.util.Scanner;
public class Practice1 {

    
    public static void main(String[] args) {

        int firstNumber; 
        int secoundNumber;
        int sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the secound number: ");
        secoundNumber = scanner.nextInt();

        sum = firstNumber + secoundNumber;

        System.out.printf("The sum of %d and %d is: %d\n", firstNumber, secoundNumber, sum);
        
        scanner.close();
    }
}
