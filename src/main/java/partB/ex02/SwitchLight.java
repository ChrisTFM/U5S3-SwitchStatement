package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        int currentColor = 0;
        /* Put your code in between these comments : Top */
        Scanner scan = new Scanner(System.in);
        currentColor = scan.nextInt();

        switch (currentColor) {
            case (1):
                response = "Next Traffic Light is green";
                break;
            case (2):
                response = "Next Traffic Light is yellow";
                break;
            case (3):
                response = "Next Traffic Light is red";
                break;
        }
        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
