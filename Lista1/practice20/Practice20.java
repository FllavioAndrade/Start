package Start.Lista1.practice20;

/*
The car dealership “CARANGO VELHO” is selling its vehicles at a
discount. Write an algorithm that calculates and displays the amount
of the discount and the amount to be paid by the customer for several
cars. The discount should be calculated according to the year of the
vehicle. Until 2000 - 12% and above 2000 - 7%. The system should ask
if it wants to continue calculating the discount until the answer
is: “(N) No”. Inform total cars with year up to 2000 and grand total;
*/

import java.util.Scanner;
public class Practice20{

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalCar = 0;
        int carGreaterTwo = 0;
        char repeat = 's';
        float discountValue = 0.0f;
        Float discountPercentage = 0.0f;
        Float valueVehicle = 0.0f;
        int yearVehicle;
        float valuePay;
        while(repeat == 's'){
            System.out.print("Enter the value of the vehicle: ");
            valueVehicle = scanner.nextFloat();

            System.out.print("Enter the year of the vehicle: ");
            yearVehicle = scanner.nextInt();

            if (yearVehicle <= 2000){
                discountPercentage = 0.12f;
            } 
            else{
                discountPercentage = 0.07f;
                carGreaterTwo++;
            }
            totalCar++;


            discountValue = discountPercentage * valueVehicle;
            valuePay = valueVehicle - discountValue;
            System.out.printf("amount of the discount %.2f\n",discountValue);
            System.out.printf("amount to be paid: %.2f\n",valuePay);
        
            System.out.println("\ndo you want to continue calculating the discount?\nInsert N  to exit or S to continue.");
            scanner.nextLine();
            repeat = scanner.next().charAt(0);
            
        }
        scanner.close();
        System.out.printf("\namount to the car less 2000: %d\n",carGreaterTwo);
        System.out.printf("\nGrand to the car: %d\n",totalCar);
    }
}
