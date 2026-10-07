class Solution {
    public int appendCharacters(String s, String t) {
        
        int s1 = 0;
        int t1 = 0;

        while(s1 < s.length() && t1 < t.length()){

            if(s1 < s.length() && t1 < t.length() && s.charAt(s1) == t.charAt(t1)){
                s1++;
                t1++;
            }else{
                s1++;
            }

        }

        return t.length() - t1;
    }
}