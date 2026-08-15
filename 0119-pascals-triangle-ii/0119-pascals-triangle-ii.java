class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer>list = new ArrayList<>();

        list.add(1);
        long ans = 1;

        for(int c = 1 ; c <= rowIndex ; c++ ){

            ans = ans*(rowIndex - c + 1);
            ans = ans/c;

            list.add((int)ans);


        }

        return list;
        
    }
}