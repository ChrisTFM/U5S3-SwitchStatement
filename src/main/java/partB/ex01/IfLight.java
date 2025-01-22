package partB.ex01;
import java.util.Scanner;

public class IfLight {
    public static String ifLight(){
        String response = "";
        int currentColor = 0;
        /* Put your code in between these comments : Top */
        Scanner scan = new Scanner(System.in);
        currentColor = scan.nextInt();

        if (currentColor == 1) {

        } else if (currentColor == 2) {

        } else if (currentColor == 3) {

        }
        else {

        }


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
