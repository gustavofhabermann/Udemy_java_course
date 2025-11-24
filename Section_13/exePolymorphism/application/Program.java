package exePolymorphism.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exePolymorphism.entites.ImportedProduct;
import exePolymorphism.entites.Product;
import exePolymorphism.entites.UsedProduct;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Nmae: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'c'){
                list.add(new Product(name, price));
            } else if(ch == 'u'){
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                LocalDate date =  LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else if (ch == 'i'){ 
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            } else{
                System.out.println("Please try a valid type of product!");
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
