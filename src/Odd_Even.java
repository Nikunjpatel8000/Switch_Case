import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Number = ");//print the string value
        int num = scanner.nextInt();// Int value catch & store
       //switch case use for find the odd and even number
        switch(num%2)
        {
            case 0:
                System.out.print("Enter Number Is Even Number = " + num);// String concatenations
                break;// stop the process of use break;
            case 1:
                System.out.print("Enter Number Is Odd Number = " + num);// String concatenations
                break;// stop the process of use break;
        }
    }
}
