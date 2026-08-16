class Solution {

     public List<Integer> rowgenerate(int row){

        List<Integer>list = new ArrayList<>();

        list.add(1);

        long mul = 1;

        for(int i = 1 ; i <= row ; i++){

            mul = mul*(row-i+1);
            mul = mul/i;
            list.add((int)mul);
        }

        return list;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>>mainlist = new ArrayList<>();

        for(int i = 0 ; i < numRows ;i++ ){

            mainlist.add(rowgenerate(i));
        }

        return mainlist;


        
    }

   
}