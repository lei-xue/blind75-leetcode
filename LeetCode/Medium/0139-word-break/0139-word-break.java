class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[i] is can previsou i character can be split
        /*
        dp[0] true
        dp[1] l false
        dp[2] le false
        dp[3] lee false
        dp[4] leet true
        dp[5] dp[4] + c false
              ...
              dp[0] + leetc false
        dp[6] dp[4] + co false
              ...
              dp[0] + leetco false
        dp[7] dp[4] + cod false
              ...
              dp[0] + leetcod false
        dp[8] dp[4] + code true
              ...
              dp[0] + leetcode false        
        */

        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        // base case
        dp[0] = true;

        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];

    }
}