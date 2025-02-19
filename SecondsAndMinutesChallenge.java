import java.util.Scanner;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        int seconds, minutes, option;
        Scanner in = new Scanner(System.in);
        
        System.out.println("You want to convert seconds to hours or minutes and seconds to hours?");
        System.out.println("1 - Seconds only");
        System.out.println("2 - Seconds and Minutes");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("How much seconds do you want to convert?");
                seconds = in.nextInt();

                System.out.println(getDurationString(seconds));

                break;

            case 2:
                System.out.println("How much minutes do you want to convert?");
                minutes = in.nextInt();
                System.out.println("How much seconds do you want to convert?");
                seconds = in.nextInt();

                System.out.println(getDurationString(minutes, seconds));

                break;
        
            default:
                break;
        }

        in.close();
    }

    public static String getDurationString(int seconds){

        if(seconds < 0){

            return "Invalid data dor segunds(" + seconds + "), must be a positive integer value"; 
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0){

            return "Invalid data dor minutes(" + minutes + "), must be a positive integer value"; 
        }

        if(seconds < 0 || seconds > 59){
            return "Invalid data dor segunds(" + seconds + "), must be a number between 0 and 59";
        }

        
        int remaingMinutes = minutes % 60;
        int hours = minutes / 60;

        return hours + "h " + remaingMinutes + "m " + seconds + "s";
        
        
    }
}