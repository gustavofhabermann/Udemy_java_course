package application;

import java.util.Scanner;

import entites.*;

public class program {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        
        Product product = new Product();

        //Product values
        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = in.nextLine();
        System.out.print("Price: ");
        product.price = in.nextDouble();
        System.out.print("Quantity in Stock: ");
        product.quantity = in.nextInt();

        System.out.println("Product" + product.toString());

        System.out.println("\nHow much do you want to add in stock; ");
        int toAdd = in.nextInt();
        product.addProducts(toAdd);

        System.out.println("Udpadate" + product.toString());

        System.out.println("\nHow much do you want to remove from stock; ");
        int toRemove = in.nextInt();
        product.removeProducts(toRemove);

        System.out.println("Udpadate" + product.toString());

        in.close();
    }    
}
