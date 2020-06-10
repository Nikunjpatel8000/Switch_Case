import java.util.Scanner;

public class Vowel_Consonant {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Any Alphabet = ");//print the string value
        char ch = scanner.next().charAt(0);// Int value catch & store
        //switch case using for find the vowel & Consonant Alphabet
        switch (ch) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':

                System.out.println("Character Is Vowel = " + ch);// String concatenations
                break;// stop the process of use break;

            default:
                System.out.println("Character Is Consonant = " + ch);// String concatenations
        }
    }
}




