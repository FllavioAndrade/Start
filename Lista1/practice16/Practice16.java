/*
make an algorithm that take the name and three grades given by
studant during the semester. Calculate a its average (arithmetic),
infoms the name and its mention approved (average >=7), Filed 
(average <=5), and recovery (average between 5 to 7)
 */


import java.util.Scanner;

public class Practice16{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter studant name: ");
        String name = scanner.nextLine();

        System.out.print("enter the first grade : ");
        double gradeFirst = scanner.nextDouble();

        System.out.print("enter the secound grade : ");
        double gradeSecound = scanner.nextDouble();

        System.out.print("enter the third grade : ");
        double gradeThrid = scanner.nextDouble();

        double average = (gradeFirst + gradeSecound + gradeThrid) / 3;

        if (average >= 7){
            System.out.printf("%s, Congratulations!! You are Aproved\nAverage: %.2f", name, average);
        }
        else if (average > 5 && average < 7){
            System.out.printf("%s, Almost there!! You are in recovery\nAverage: %.2f", name, average);
        }
        else{
            System.out.printf("%s, You filed!!\nAverage: %.2f", name, average);

        }
        scanner.close();
    }
}
