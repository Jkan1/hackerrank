/*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for(int index=0;index<ar.size();index++){
            sum+=ar.get(index);
        } 
        return sum;
    }
