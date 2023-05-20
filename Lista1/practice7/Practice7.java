package Start.Lista1.practice7;

/*
Read a temperature in degrees Celsius and display it converted
to degrees Fahrenheit. the formula of conversion is: F=(9*C+160) / 5, 
where F is the temperature in Fahrenheit and C is the temperature in
Celsius
*/
import java.util.Scanner;

public class Practice7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160)/5; 

        System.out.printf("Fahrenheit: %.2fº\nCelsius: %.2fº",fahrenheit, celsius);
        scanner.close();
    }
    
}
