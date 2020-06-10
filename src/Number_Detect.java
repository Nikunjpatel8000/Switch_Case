import java.util.Scanner;

public class Number_Detect {
    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Number(0 - 9) = "); //print the string value
        int a = scanner.nextInt(); // Int value catch & store
        //switch case use for 0-9 number 0nly pressed
        switch (a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print("Enter Pressed Number Is = " + a);// String concatenations
                break;// stop the process of use break;
            default://enter any different value is not allowed
                System.out.print("Enter Number Is Not Allowed = " + a);// String concatenations
                break;// stop the process of use break;
        }
    }
}
