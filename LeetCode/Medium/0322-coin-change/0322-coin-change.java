class Solution {
    public int coinChange(int[] coins, int amount) {
        /*
            0  1   2   3   4   5    6   7   8   9   10  11
        1   0  1   2   3   4   5    6   7   8   9   10  11
        2   0  1   1   2   2   3    3   4   4   5   5   6
        5   0  1   1   2   2   1    2   2   3   3   2    3   
        */
        int max = amount + 1;
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1]; 
        // dp[i][j] is the minimum coins needed for get j amount at current i coins
        
        // base case
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= amount; j++){
            dp[0][j] = amount + 1; // mean infinity
        }

        for(int i = 1; i <=n; i++){
            int coin = coins[i - 1];
            for (int j = 1; j <= amount; j++){
                if(j< coin){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coin] + 1);
                }
            }
        }

        return dp[n][amount] > amount ? -1 : dp[n][amount];


    }
}