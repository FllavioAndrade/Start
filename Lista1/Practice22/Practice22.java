package Start.Lista1.Practice22;
import java.util.Scanner;

/*
 Write an algorithm that receives the cost price and the selling
 price of 40 products. Show as a result whether there was a profit,
 loss or tie for each product. Enter the cost value of each product,
 the sales value of each product, average cost price and sales price;

 */

 public class Practice22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float costPrice[] = new float[4];
        float sellingPrice[] = new float[4];
        float sellingAvg = 0;
        float costAvg = 0;

        for(int i = 0; i <40; i++){
            System.out.print((i+1) + "º | Enter the cost price of product: ");
            costPrice[i] =scanner.nextFloat();
            costAvg += costPrice[i];
            System.out.print((i+1) + "º | Enter the selling price of product: ");
            sellingPrice[i] = scanner.nextFloat();
            sellingAvg += sellingPrice[i];
        }
        scanner.close();
        for (int i = 0; i <40; i++){
            System.out.println("cost: " + costPrice[i] + "\nSale: " + sellingPrice[i]);
            float result = sellingPrice[i] - costPrice[i];
            if (result == 0){
                System.out.println(result + " | draw\n");
            }
            else if((costPrice[i] > sellingPrice[i])){
                System.out.println(result + " | loss\n");
            }
            else{
                System.out.println(result + " | profit\n");
            }
        }
        System.out.println("average cost price = " + costAvg/40);
        System.out.println("average sales price = " + sellingAvg/40);
    }
 }