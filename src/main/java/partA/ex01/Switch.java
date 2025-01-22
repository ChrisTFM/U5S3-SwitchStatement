package partA.ex01;

import java.util.Scanner;

public class Switch {

    public static String switchStatement(){
        String response = "";
        Scanner scan = new Scanner(System.in);
        /* Put your code in between these comments : Top */
        int month = scan.nextInt();

        switch(month) {
            case 1:
                response = "Jan";
                break;
            case 2:
                response = "Feb";
                break;
            case 3:
                response = "Mar";
                break;
            case 4:
                response = "Apr";
                break;
            case 5:
                response = "May";
                break;
            case 6:
                response = "June";
                break;
            case 7:
                response = "July";
                break;
            case 8:
                response = "Aug";
                break;
            case 9:
                response = "Sep";
                break;
            case 10:
                response = "Oct";
                break;
            case 11:
                response = "Nov";
                break;
            case 12:
                response = "Dec";
                break;
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchStatement();
        System.out.println(switchOutput);
    }
}
