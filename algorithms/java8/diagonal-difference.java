class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

    int d1=0;
    int d2=0;
    int temp=0;

    //Primary diagonal
    for(int i=0;i<arr.size();i++){
        temp = (int) arr.get(i).get(i);
        d1 += temp;
    }

    //Secondary diagonal
    for(int i=0;i<arr.size();i++){
        int aux = -1*i-1;
        temp = (int) arr.get(i).get(arr.size()+aux);
        d2 += temp;
    }

        return Math.abs(d2-d1);
    }

}
