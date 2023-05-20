/*
Make an algorithm that receives an amount that has been deposited 
and the number of months and displays the amount with income after 
the chosen number of months. Consider the savings interest fixed at 
0.07% a. m;
*/


import java.util.Scanner;
public class Practice9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("amount deposited: ");
        double amount = scanner.nextDouble();

        System.out.print("number of months: ");
        int  months = scanner.nextInt();

        System.out.printf("amount deposited: %.2f", amount);
        for(int i = 1; i<= months; i++){
            amount += amount * 0.07;
        }
        System.out.printf("value with income: %.2f",amount);
        scanner.close();
    }
    
}
