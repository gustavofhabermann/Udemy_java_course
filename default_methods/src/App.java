import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months:");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println();
        System.out.println("USA:");
        System.out.println("Payment after " + months + " months: " + String.format("%.2f", payment));

        InterestService is2 = new BrazilInterestService(2.0);
        double payment2 = is2.payment(amount, months);

        System.out.println();
        System.out.println("Brazil:");
        System.out.println("Payment after " + months + " months: " + String.format("%.2f", payment2));

        sc.close();
    }
}
