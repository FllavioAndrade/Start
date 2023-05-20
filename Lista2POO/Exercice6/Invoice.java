
package Start.Lista2POO.Exercice6;

public class Invoice {

    private int itemCode;
    private String description;
    private int amount;
    private float price;

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }

    public float getPrice() {
        return price;

    }

    public void setPrice(float price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public Invoice(int itemCode, String description, int amount, float price) {
        setItemCode(itemCode);
        setDescription(description);
        setPrice(price);
        setAmount(amount);

    }

    public double getIvoiceAmount() {
        return amount * price;
    }

}
