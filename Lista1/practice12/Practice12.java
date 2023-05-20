package Start.Lista1.practice12;

/*
The consumer cost of a new car is the sum of the factory cost plus the
dealer's percentage and of the applied taxes (first the taxes are 
applied on the factory cost, and then the percentage from the 
distributor about the result). Assuming that the distributor's 
percentage is 28% and taxes 45%, write an algorithm that reads the 
factory cost of a car and reports the cost to the consumer of the car.
same;
*/


import java.util.Scanner;
public class Practice12 {

    public static void main(String[] args) {

        double pDistributor = 0.28;
        double taxes = 0.45;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the value car: ");
        double car = scanner.nextDouble();

        car = car * (1+taxes);
        car = car * (1+pDistributor);

        System.out.printf("New value car: %.2f", car);            
        scanner.close();
        }
}
