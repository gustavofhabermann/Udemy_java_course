package entites;

public class Product {

    public String name;
    public double price;
    public double quantity;

    public double TotalValueInStock(){
        return (price * quantity);
    }

    public void addProducts(int quantity){
        this.quantity += quantity;

    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return " data: " + name + ", $" + String.format("%.2f", price)  + ", " + quantity + " units, Total: $" + String.format("%.2f", TotalValueInStock()) ;
    }
    
}
