/*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int rotateCount = (d % arr.size());
        
        for(int rCount=1;rCount<=rotateCount;rCount++) {
            int temp = arr.get(0);
            for(int index=1;index<arr.size();index++){
                arr.set(index-1,arr.get(index));
            }
            arr.set(arr.size()-1,temp);
        }
        return arr;
    }
