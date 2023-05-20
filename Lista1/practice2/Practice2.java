package Start.Lista1.practice2;
//Make an algorithm that receives two numbers and at the end shows the addition, subtraction, multiplication and division of the two numbers read;
import java.util.Scanner;
public class Practice2 {

    public static void main(String[] args) {

        int firstNumber;
        int secoundNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the secound number: ");
        secoundNumber = scanner.nextInt();

        int sum = firstNumber + secoundNumber;
        int minus = firstNumber - secoundNumber;
        int mult = firstNumber * secoundNumber;
        double div = (double) firstNumber / secoundNumber;

        System.out.printf("%d + %d = %d\n", firstNumber, secoundNumber, sum);
        System.out.printf("%d - %d = %d\n", firstNumber, secoundNumber, minus);
        System.out.printf("%d * %d = %d\n", firstNumber, secoundNumber, mult);
        System.out.printf("%d / %d = %.2f\n", firstNumber, secoundNumber, div);

        scanner.close();
    }
}
