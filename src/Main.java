import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String myletter = "";
        double number=0;
        boolean done = false;

        do{
            System.out.println("enter a letter");
            if (in.hasNextDouble()){
                number = in.nextDouble();
                System.out.println("need a letter, you gave "+number);
                in.nextLine();
            }
            else {
                myletter = in.nextLine();
                if (myletter.length() == 1){
                    done = true;
                }
                else {
                    System.out.println("need a single letter");
                }
            }
        }while (!done);
        myletter = myletter.toLowerCase();
        switch(myletter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "y":
                System.out.println(myletter + " is a vowel");
                break;
            default:
                System.out.println(myletter + "is a constant" );
                System.out.println("TRY AGAIN");
                break;
        }



    }
}