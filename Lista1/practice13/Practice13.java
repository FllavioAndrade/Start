package Start.Lista1.practice13;

/*
make an algorithm that recives a number and display a message if this
number is greater than 10.
*/


import java.util.Scanner;
public class Practice13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        if (number > 10){
            System.out.printf("wow, %d is greater than 10!", number);
        }
        else{
            System.out.printf("%d is not greater than 10!",number);

        }
        scanner.close();
    }
}
