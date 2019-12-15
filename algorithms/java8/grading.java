import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
    
    List<Integer> rounded = new ArrayList<Integer>();
  
    for(int i=0; i<grades.size(); i++){
      
        int currentGrade = grades.get(i); //First we get the current grade

        if(currentGrade<38){ //If the grade is less than 38
            rounded.add(currentGrade); //We add the grade, unrounded to the List

        } else if(grades.get(i)%5!=0){ //Otherwise, we'll check if it's not divisible by 5
        
            //Then we get the next number that is divisible by 5
            int newGrade = grades.get(i); 
            
            while(grades.get(i)%5!=0){
                newGrade++;
                grades.set(i, newGrade);
            }

            if((newGrade-currentGrade)<3){ //If the difference between them is less than 3
                rounded.add(newGrade); //We add this new grade to the list
                
            } else {
                rounded.add(currentGrade); //Otherwise, we keep the current value
            }

        } else { //If it is divisible by 5, there is no need to compare, we set it right away:

            rounded.add(currentGrade);

        }
    }

    return rounded;



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
