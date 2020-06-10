import java.util.Scanner;

public class Day_Name {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Number(1 - 7) = ");// String value print
        int a = scanner.nextInt();// Int value catch & store
        //switch case using
        switch (a) {
            case 1:
                System.out.print("Day Name Is Sunday = " + a);// String concatenations
                break;// stop the process of use break;
            case 2:
                System.out.print("Day Name Is Monday = " + a);// String concatenations
                break;// stop the process of use break;
            case 3:
                System.out.print("Day Name Is Tuesday = " + a);// String concatenations
                break;// stop the process of use break;
            case 4:
                System.out.print("Day Name Is Wednesday = " + a);// String concatenations
                break;// stop the process of use break;
            case 5:
                System.out.print("Day Name Is Thursday = " + a);// String concatenations
                break;// stop the process of use break;
            case 6:
                System.out.print("Day Name Is Friday = = " + a);// String concatenations
                break;// stop the process of use break;
            case 7:
                System.out.print("Day Name Is Saturday = " + a);// String concatenations
                break;// stop the process of use break;
            default:
                System.out.print("Invalid choice!!! = " + a);// String concatenations
                break;// stop the process of use break;
        }
    }
}
