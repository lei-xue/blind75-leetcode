class Solution {
    public boolean isPalindrome(String s) {
        // replace method
        // String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // int left = 0;
        // int right = result.length() - 1;
        // while(left < right){
        //     if(result.charAt(left) != result.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            };
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            };
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            };
            left++;
            right--;

        }
        return true;
    }
}