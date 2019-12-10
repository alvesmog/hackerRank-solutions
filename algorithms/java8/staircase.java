import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        //Number of characteres is equal to the size, which is n;

        //Number of # is equal to i

        for(int i=1;i<=n;i++){

            int step = 1;

            int emptySpaces = n-i;

            for(int i2=1; i2<=emptySpaces; i2++){
                System.out.print(" ");
            }

            while(step<=i){
                System.out.print("#");
                step++;
            }

            System.out.print("\n");

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
