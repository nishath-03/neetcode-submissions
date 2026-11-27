class Solution {
    public int minDistance(String text1, String text2) {
        int n=text1.length(); int m = text2.length();
        if(text1.length()==0)return text2.length();
        else if(text2.length()==0)return text1.length();
        
        int dp[][] = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) dp[i][0] = i;
        for (int j = 0; j <= m; j++) dp[0][j] = j;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                }
            }
        }
        return dp[n][m];
    }
}
