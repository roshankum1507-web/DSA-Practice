class Solution {
    public boolean isPalindrome(String s) {

        String str = s;
        int low = 0;
        int high = str.length()-1;

        while(low<=high){

            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }

            if (Character.toLowerCase(s.charAt(low)) !=
                Character.toLowerCase(s.charAt(high))) {
                return false;
            }

            low++;
            high--;
        }

        return true;
        
    }
}