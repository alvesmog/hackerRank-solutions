import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        //If we order the array first, the Min value will be the sum of the first four elements and the Max value, the sum of the last four, so:

        //As it's an array of five, we will use a simple bubble sort algorithm to sort it out

        int aux = 0;  
         for(int i=0; i < arr.length; i++){  
                 for(int j=1; j < (arr.length-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 aux = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = aux;  
                         }  
                          
                 }  
         }  

        //Min value

        long min_value = 0;
        for(int i=0;i<arr.length-1;i++){
            min_value+=arr[i];
        }

        //Max value

        long max_value = 0;
        for(int i=1;i<arr.length;i++){
            max_value+=arr[i];
        }

        System.out.print(min_value + " " + max_value);

    }



    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
