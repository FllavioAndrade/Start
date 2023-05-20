package Start.Lista1.practice21;

/*

Write an algorithm that reads the data of “N” people (name, gender, 
age and health) and informs whether or not they are able to fulfill
their mandatory military service. Report the totals;
 */
import java.util.Scanner;

public class Practice21{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int qtd = 0;

        while (true){
            System.out.print("Enter your name: ");
            String pessoa = scanner.nextLine();
            System.out.println("Enter your gender: \n1.Male\n2.Famele");
            int gender = scanner.nextInt();
            System.out.print("\nEnter your years old: ");
            int year = scanner.nextInt();
            System.out.println("\nEnter your gender:\n1.Great\n2.Bad");
            int health= scanner.nextInt();
            scanner.nextLine();
            if(health == 2 || year < 18 || gender == 2){
                System.out.printf("\n%s, you are not fit for mandatory military service\n\n", pessoa);
            }else{
                System.out.printf("%s, you are fit for mandatory military service. Wellcome!\n\n", pessoa);
                qtd++;
            }
            System.out.printf("%d people  fit for mandatory military service. !\n\n", qtd);
            scanner.close();
        }
    }

}





