import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter First Numbers = ");//print String value
        double a = scanner.nextDouble(); // double value catch & store

        System.out.print("Enter Second Numbers = ");//print String value
        double b = scanner.nextDouble();// double value catch & store

        System.out.print("Enter an operator (+, -, *, /) = ");//print String value
        char operator = scanner.next().charAt(0);// char value catch & store
        double result;//local variable
        //switch-case use
        switch (operator) {
            case '+':
                result = a + b;//addition of a & b
                break;// stop the process of use break;
            case '-':
                result = a - b;//subtraction of a & b
                break;// stop the process of use break;
            case '*':
                result = a * b;//multiplication of a & b
                break;// stop the process of use break;
            case '/':
                result = a / b;//division of a & b
                break;// stop the process of use break;
            default:// operator doesn't match  (+, -, *, /)
                System.out.print("Invalid Entry!!!");//print String value
                return;// return the process of use return; & and string concatenation print
        }

        System.out.print("Result Is = " + result);// String concatenations
    }

}
