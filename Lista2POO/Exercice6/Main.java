package Start.Lista2POO.Exercice6;

public class Main{
    
    public static void main(String[] args) {
        Invoice inv = new Invoice(1,"Maousepad",-10,50.0f);
        System.out.println("Valor total = " + inv.getIvoiceAmount());
    }
    
}

