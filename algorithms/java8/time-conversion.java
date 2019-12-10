import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        //We have to check if the time is either AM or PM
        //if it's AM, we do nothing, and simply convert, but theres a special case, if it's 12AM, we have to subtract 12 hours in order to get 00;
        //if it's PM, we add up 12 hours

        int hours, min, sec;

        String[] str = s.split(":", 0);

        hours = Integer.parseInt(str[0]);
        min = Integer.parseInt(str[1]);
        sec = Integer.parseInt(str[2].substring(0, str[2].length()-2));

        if(str[2].substring(str[2].length()-2, str[2].length()).equals("PM") && hours != 12){
            hours+=12;
        } else if (str[2].substring(str[2].length()-2, str[2].length()).equals("AM") && hours == 12){
            hours-=12;
        }

        String military = String.format("%02d:%02d:%02d", hours,min,sec);

        return military;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
