/*
Develop an algorithm that performs the presentation of the value of
the conversion in real (R$) of a value read in dollar (US$). The
algorithm should ask for the quoted value of the dollar and also the
amount of dollars available with the user;
*/

import java.util.Scanner;

public class Practice8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter dollar quotation: ");
        double quotationDollar = scanner.nextDouble();

        System.out.print("Enter how many dollars you have: ");
        double  dollarAmount= scanner.nextDouble();

        double real = quotationDollar * dollarAmount;

        System.out.printf("dollar amount: %.2f\n Dollar quotation: %.2fU$\nValue in Real %.2fR$: ",dollarAmount, quotationDollar, real);
        scanner.close();
    }
    
}
