/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumM = 0, sumN =0;
        for(int index=0; index<arr.size(); index++){
            sumM+= arr.get(index).get(index);
            sumN+= arr.get(index).get(arr.size()-index-1);
        }
        int finalSum =  sumM - sumN;
        if(finalSum<0){
            finalSum = - finalSum;
        }
        return finalSum;
    }
