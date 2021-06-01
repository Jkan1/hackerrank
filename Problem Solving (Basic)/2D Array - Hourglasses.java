/*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> sums = new ArrayList<Integer>();
        
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                
                int sum = arr.get(row).get(col);
                sum+=arr.get(row).get(col+1);
                sum+=arr.get(row).get(col+2);
                
                sum+= arr.get(row+1).get(col+1);
                
                sum+= arr.get(row+2).get(col);
                sum+=arr.get(row+2).get(col+1);
                sum+=arr.get(row+2).get(col+2);
                sums.add(sum);
            }
        }
        int maxSum = sums.get(0);
        for(int index=0;index<sums.size();index++){
            if(sums.get(index)>maxSum){
                maxSum = sums.get(index);
            }
        }
        return maxSum;
    }
