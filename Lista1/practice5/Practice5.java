package Start.Lista1.practice5;

/*
Write an algorithm that reads a student's name and the grades on the
three exams he took that semester. At the end, inform the student's
name and average (arithmetic);
 */

import java.util.Scanner;
public class Practice5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter name studant: ");
        String studant = scanner.nextLine();

        System.out.print("enter first note: ");
        double noteOne = scanner.nextDouble();

        System.out.print("enter secound note: ");
        Double noteTwo = scanner.nextDouble();

        System.out.print("enter third note: ");
        Double noteThree = scanner.nextDouble();
        
        double average = (noteOne+noteTwo+noteThree)/3;

        System.out.printf("name: %s\nfinal average: %.2f",studant, average);
        scanner.close();
    }
    
}
