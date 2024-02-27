import java.util.Scanner;

public class same {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        String trash ="";

        System.out.println("give me a number");
        if (in.hasNextDouble()) {
            num1 = in.nextDouble();
            System.out.println("give me another");
            if (in.hasNextDouble()) {
                num2 = in.nextDouble();
                System.out.println("give me another");
                if (in.hasNextDouble()) {

                    if (in.hasNextDouble()) {
                        num1 = num2 = num3;
                        System.out.println("all same");

                    } else if (num1 != num2 ) {

                        System.out.println("all different");
                    }else {
                        System.out.println("neither");
                    }

                }else {
                    trash = in.nextLine();

                }


            }else {
                trash = in.nextLine();

            }
        }else {
            trash = in.nextLine();

        }
    }
}
