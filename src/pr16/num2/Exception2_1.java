package pr16.num2;

import java.util.Scanner;

public class Exception2_1 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}