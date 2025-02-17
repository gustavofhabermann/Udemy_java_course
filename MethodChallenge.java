import java.util.Scanner;

public class MethodChallenge {
    public static void main(String args[]){

        String playerName;
        int Grade;

        Scanner in = new Scanner(System.in);

        System.out.println("What's the student name?");
        playerName = in.nextLine();

        System.out.println("What's the student grade?");
        Grade = in.nextInt();

        HighScorePosition(Grade);

        MessageOfScore(playerName);

        in.close();

    }

    public static void MessageOfScore(String playerName){
        System.out.println(playerName + " Maneged to get into position: " + HighScorePosition(0) + " on the high score list" );
    }

    public static int HighScorePosition(int Grade){

        if(Grade >= 1000){
            return 1;
        } else if (Grade >= 500) {
            return 2;
        }
        return 3;
    }

}