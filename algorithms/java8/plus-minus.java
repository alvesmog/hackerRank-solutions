public class Solution {

    static void plusMinus(int[] arr) {

        //positives/total, negatives/total, zeroes/total

        int pos=0, neg=0, zer=0;

        int num = arr.length;

        for(int i:arr){

            if(i>0){
                pos++;
            } else if(i<0){
                neg++;
            } else {
                zer++;
            }

        }

        int[] res = new int[3];
        res[0]=pos;
        res[1]=neg;
        res[2]=zer;

        for(float i:res){
            System.out.println(i/num);
        }

    }
