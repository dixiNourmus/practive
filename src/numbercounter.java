import java.util.Scanner;

public class numbercounter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int myNum = 0;
        String trash = "";

       while(true) {
            System.out.println("give me a number");
            if(in.hasNextInt()){
                in.nextInt();
                break;
            }
            else{
              trash = in.nextLine();
              in.nextLine();
                System.out.println("you gave me trash" +trash);
                break;
            }
        }

        if (myNum <= 9){

            System.out.println("you gave me a single int");

        }
        else if (myNum <= 99){

            System.out.println("you gave me a double int");
        }
        else{
            System.out.println("you gave me a triple int or more");
        }


    }
}
