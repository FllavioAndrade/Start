package Start.Lista1.practice19;


/*
Make an algorithm that receives the amount of people you want to enter
and the age of each person. then read the name and gender of each 
person and inform whether they are a man or a woman and the number of
men and women.
*/

import java.util.Scanner;
public class Practice19{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many peaple do you want to insert? ");
        int amount  = scanner.nextInt();
        
        int female = 0;
        int male = 0;

        for (int i = 0; i < amount; i++){
            scanner.nextLine(); // Consumes the newline left by nextInt()

            System.out.print("enter the name: ");
            scanner.nextLine();

            System.out.println("enter the sexo\n1.female\n2. male");
            int gender  = scanner.nextInt();

            if (gender == 1){
                female++;
            } 
            else{
                male++;
            }
        }
        System.out.printf("Number of females: %d\n",  female);
        System.out.printf("Number of males: %d\n", male); 
        scanner.close();
    }
}
