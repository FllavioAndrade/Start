/*
make an algorithm that recives two different numbers and display
which is greater*/


import java.util.Scanner;

public class Practice14
 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("e: ");
        int numberOne = scanner.nextInt();

        System.out.print("enter the secound number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo){
            System.out.printf("%d is greater than %d!", numberOne, numberTwo);
        }
        else{
            System.out.printf("%d is greater than %d!", numberTwo, numberOne);

        }
        scanner.close();
    }
}
