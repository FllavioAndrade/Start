/*
make an algorithm that takes a number and display if this number is
 in the range 100 and 200
 */


import java.util.Scanner;

public class Practice15{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int number = scanner.nextInt();

        if (number > 100 || number < 200 ){
            System.out.printf("%d is in the range 100 and 200!", number);
        }
        else{
            System.out.printf("%d is not in the range 100 and 200!", number);

        }
        scanner.close();
    }
}
