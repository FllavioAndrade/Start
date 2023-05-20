//Write an algorithm to determine the average consumption of a car given the distance total traveled by the car and the total amount of fuel used;
package Start.Lista1.practice3;
import java.util.Scanner;
public class Practice3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("report the distance travelled: ");
        double distance = scanner.nextDouble();
        
        System.out.print("report the total fuel used: ");
        double used = scanner.nextDouble();

        double consumption = used/distance;

        System.out.printf("The avarege consuption is: %.2fl/km", consumption);
        scanner.close(); 

    }


}