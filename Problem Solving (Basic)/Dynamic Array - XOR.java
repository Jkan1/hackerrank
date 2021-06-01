/*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
        List<List<Integer>> arr = new ArrayList<List<Integer>>(n);
        for(int index=0;index<n;index++){
            arr.add(new ArrayList<Integer>());
        }
        List<Integer> answers = new ArrayList<Integer>();
        int lastAnswer = 0;
        
        for(int qIndex=0;qIndex<queries.size();qIndex++){
            int qVar1 = queries.get(qIndex).get(1);
            int qVar2 = queries.get(qIndex).get(2);
            if(queries.get(qIndex).get(0) == 1){
                arr.get((qVar1^lastAnswer)%n).add(qVar2);
            } else {
                int newIdx = (qVar1^lastAnswer)%n;
                lastAnswer = arr.get(newIdx).get(qVar2 % arr.get(newIdx).size());
                answers.add(lastAnswer);
            }
        }
        return answers;
    }
