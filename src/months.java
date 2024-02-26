import java.util.Scanner;
public class months {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int monthInput = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.println("give me a number");
            if (in.hasNextInt()){
                monthInput = in.nextInt();
                in.nextLine();
                if (monthInput > 0 && monthInput < 13){
                    done = true;
                }
                else{
                    System.out.println("outside of range");

                }

            }
            else {
                trash = in.nextLine();

            }

        }while(done == false);

        done = false;
        switch (monthInput){
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.println("theres 30 days in that month");
                break;
            case 2:
                System.out.println("you have 29 days in that month");
                break;
            default:
                System.out.println("your month has 31 days");
                break;
        }



    }
}
