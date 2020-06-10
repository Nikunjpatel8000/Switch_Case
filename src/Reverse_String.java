import java.util.Scanner;

 public class Reverse_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Any Characters = ");//print the string value
        String s = scanner.nextLine();// String value catch & store

        StringBuilder sb = new StringBuilder(s);//StringBuilder class is used to create modifiable string

        System.out.print("Reverse Characters Is = " + sb.reverse().toString());//Reverse the string value & String concatenations
    }

 }
