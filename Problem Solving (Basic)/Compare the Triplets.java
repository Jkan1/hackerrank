/*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
        Integer[] score = new Integer[2];
        score[0] = 0;
        score[1] = 0;
        for(int index=0; index<a.size();index++){
            if(a.get(index)>b.get(index)){
                score[0]++;
            }else if(a.get(index)<b.get(index)){
                score[1]++;
            }
        }
        List<Integer> scoreList = Arrays.asList(score);
        return scoreList;
    }

}