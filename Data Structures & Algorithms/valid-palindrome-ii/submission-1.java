class Solution {
    public boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return ispalindrome(left+1 , right, s) || ispalindrome(left , right - 1, s);     
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    static public boolean ispalindrome(int left, int right, String s){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}