public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice=0, bob=0;

        for(int i=0; i<3; i++){

            int tempA = a.get(i);
            int tempB = b.get(i);

            if (tempA>tempB){
                alice++;
            } else if (tempA<tempB){
                bob++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(alice);
        result.add(bob);
        return result;


    }
