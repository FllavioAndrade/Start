
/*
Read how many  numbers the user want to insert and at the end inform
how many number(s) are in the range between 10 (inclusive) and 150.
*/


import java.util.Scanner;

public class Practice17{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to insert? ");
        int amount  = scanner.nextInt();
        int yes = 0;

        double number[] = new double [amount];
        for (int i = 0; i < amount ; i++){
            System.out.printf("enter the %dº number: ",i+1);
            number[i]  = scanner.nextDouble();
            if (number[i] >= 10 && number[i] <= 150){
                yes++;
            }
        }
        System.out.printf("%d numbers is in range of 10 and 150", yes);
        scanner.close();        
    }
}
