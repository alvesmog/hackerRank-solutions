import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        //First, to make it simpler, we'll solve for apples, as the same solution applies to oranges as well, so...

        int applesInside = 0;

        //'a' is the position of the apple tree

        //We have to add up this number to the apples array and the count how many elements in that array will fall within the specified range, this is s<=range<=t

        for (int i=0; i<apples.length; i++){
            int aux = apples[i];
            aux+=a;
            apples[i]=aux;
        }

        //Now that we have an apple array containing the absolute position of each apple that fell, we can check which of it's elements are within the specified range:

        for(int i:apples){
            if(i>=s && i<=t){
                applesInside++;
            }
        }


        //Applying the same solution to oranges:

        int orangesInside = 0;

        for (int i=0; i<oranges.length; i++){
            int aux = oranges[i];
            aux+=b;
            oranges[i]=aux;
        }

        for(int i:oranges){
            if(i>=s && i<=t){
                orangesInside++;
            }
        }


        //Printing out the result:

        System.out.println(applesInside);
        System.out.println(orangesInside);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
