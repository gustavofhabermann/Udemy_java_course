import java.util.Scanner;

public class OverloadedMethod {
    public static void main(String[] args) {
        int Feet;
        int Inches;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Do you wnat to check your height in inches only or foot and inches");
        System.out.println("Inches only - 1");
        System.out.println("Foot and inches - 2");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Whats your height in Inches?");
                Inches = in.nextInt();
                System.out.println("Your height in centimeters: " + convertToCentimeters(Inches));
                break;

            case 2:
                System.out.println("Whats your height in Feet?");
                Feet = in.nextInt();
                System.out.println("Whats your height in Inches?");
                Inches = in.nextInt();
                System.out.println("Your height in centimeters: " + convertToCentimeters(Inches, Feet));
                break;
        
            default:
                System.out.println("Choose a valid number!");
                break;
        }

        in.close();
        
    }

    public static double convertToCentimeters(int Inches){

        return Inches * 2.54;
    }

    public static double convertToCentimeters(int Inches,int Feet){
        
        int feetToInches = Feet * 12;
        int totalInches = feetToInches + Inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
