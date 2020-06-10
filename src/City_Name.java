import java.util.Scanner;

public class City_Name {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Character A - F (Capital-Letter) = ");//print the string value
        char a = scanner.next().charAt(0); // Char value catch & store
        //switch-case use
        switch (a) {
            case 'A':
                System.out.print("City Name Is Ahemdabad = " + a);// String concatenations
                break;// stop the process of use break;
            case 'B':
                System.out.print("City Name Is Bombey = " + a);// String concatenations
                break;// stop the process of use break;
            case 'C':
                System.out.print("City Name Is Chotaudaipur = " + a);// String concatenations
                break;// stop the process of use break;
            case 'D':
                System.out.print("City Name Is Dilhi = " + a);// String concatenations
                break;// stop the process of use break;
            case 'E':
                System.out.print("City Name Is E_Space City = " + a);// String concatenations
                break;// stop the process of use break;
            case 'F':
                System.out.print("City Name Is Face City = " + a);// String concatenations
                break;// stop the process of use break;
            default://if you enter dose'n match
                System.out.print("Invalid Entry!!! = " + a);// String concatenations
                break;// stop the process of use break;
        }
    }
}
