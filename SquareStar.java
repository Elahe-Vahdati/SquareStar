// مربع تو خالی با ستاره
import java.util.Scanner;
public class SquareStar {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("برای مربع یک عدد وارد کنید: ");
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {

            for (int j = 1; j <= s; j++) {


                if (i == 1 || i == s || j == 1 || j == s) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }

            }

            System.out.println();
        }

        sc.close();
    }
}