package Start.Lista1.practice4;

/*
Write an algorithm that reads a seller's name, his fixed salary and the total sales made
for him in the month (in cash). Knowing that this seller earns 15% commission on his sales
performed, inform your name, fixed salary and salary at the end of the month;
 */

import java.util.Scanner;
public class Practice4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter seller name: ");
        String name = scanner.nextLine();

        System.out.print("seller's salary: ");
        Double fixedSalary = scanner.nextDouble();

        System.out.print("total sales value: ");
        Double sales = scanner.nextDouble();
        
        double finalSalary = fixedSalary+(sales*0.15);

        System.out.printf("name: %s\nFixed Salary: %.2f\nFinal salary: %.2f",name, fixedSalary,finalSalary);
        scanner.close();
    }
    
}
