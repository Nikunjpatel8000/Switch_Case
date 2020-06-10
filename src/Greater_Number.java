import java.util.Scanner;

public class Greater_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The First Number = ");//print the string value
        int a = scanner.nextInt();// Int value catch & store
        System.out.print("Enter The Second Number = ");//print the string value
        int b = scanner.nextInt();// Int value catch & store
        System.out.print("Enter The Third Number = ");//print the string value
        int c = scanner.nextInt();// Int value catch & store

        //if else use for find the largest number using the operator
        if ((a > b) && (a > c)) {
            System.out.print("Largest Number Is = " + a);// String concatenations
        } else if (b > c) {
            System.out.print("Largest Number Is = " + b);// String concatenations
        } else {
            System.out.print("Largest Number Is = " + c);// String concatenations
        }
    }

}
