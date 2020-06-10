import java.util.Scanner;

public class Negative_Zero_Positive {

    // Checks positive or negative or zero
    public static int positive(int num) {//static method & use parameter,local variable
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        while (true) {//condition check while condition true pass next code
            System.out.print("Enter Any Number = ");//string value print
            int num = scanner.nextInt();//int value catch and store
            int ans = positive(num);//method call in main method using local variable
            // different logic for positive, negative or neither positive nor negative.
            switch (ans) {
                case 0:
                    System.out.println("Number Is Negative !!! " + num);//String Concatenation
                    break;// stop the process of use break;
                case 1:
                    System.out.println("Number Is Positive !!! " + num);//String Concatenation
                    break;// stop the process of use break;
                default:
                    System.out.println("Number Is Zero !!! " + num);//String Concatenation
            }
            break;// stop the process of main method use break;
        }
    }
}


