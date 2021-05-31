/*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int nCount=0,pCount=0,zCount=0;
        for(int index=0;index<arr.size();index++){
            if(arr.get(index)>0){
                pCount++;
            }else if(arr.get(index)<0){
                nCount++;
            }else {
                zCount++;
            }
        }
        
        float result = (float) pCount/ (float)arr.size();
        System.out.println(String.format("%.6f",result));
        result = (float)nCount/(float)arr.size();
        System.out.println(String.format("%.6f",result));
        result = (float)zCount/(float)arr.size();
        System.out.println(String.format("%.6f",result));
    }
