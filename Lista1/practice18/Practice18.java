package Start.Lista1.practice18;


/*
Make an algorithm that receives the amount of people that you want to
insert and the age of each person. display a message stating  “of age”
and “underage” for each person. Consider age equal to or greater than
18 years;
*/
import java.util.Scanner;
public class Practice18{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many peaple do you want to insert? ");
        int amount  = scanner.nextInt();

        double number[] = new double [amount];
        for (int i = 0; i < amount ; i++){
            System.out.printf("enter the %dº age: ",i+1);
            number[i]  = scanner.nextDouble();
            if (number[i] >= 18){
                System.out.print("aged of age\n");
            }
            else{
                System.out.print("aged underage\n");
            }
        }
        scanner.close();
    }
}
