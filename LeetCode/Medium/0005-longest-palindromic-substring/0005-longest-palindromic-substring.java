class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            String p1 = expand(s, i, i);
            String p2 = expand(s, i, i+1);

            // update
            if (p1.length() > res.length()) res = p1;
            if (p2.length() > res.length()) res = p2;
        }
        return res;
    }

    private String expand(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        // should be left+1 and right!
        return s.substring(left+1, right);
    }
}