class Solution {
    public boolean isPalindrome(int x) {

        int duplicate = x;

        int reverse = 0;

        while (x > 0) {

            int lastdigit = x % 10;

            reverse = (reverse * 10) + lastdigit;

            x = x / 10;

        }

        if (duplicate == reverse) {

            return true;
        }

        else {

            return false;
        }

    }
}