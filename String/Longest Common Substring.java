package String;

public class Longest Common Substring {
    
    QUESTION: -

    https://www.geeksforgeeks.org/problems/longest-common-substring1452/1


}

---------------------JAVA----------------------

class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int n = str1.length();
        int m = str2.length();
        
        int[][] dp = new int[n + 1][m + 1];
        
        int maxLength = 0;
        
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                if(str1.charAt(i - 1) == str2.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
            
        }
        return maxLength;
    }
}


-------------------------------PYTHON---------------------------

class Solution:
    def longestCommonSubstr(self, str1, str2):
        n = len(str1)
        m = len(str2)
        
        dp = [[0] * (m + 1) for _ in range(n + 1)]
        maxLength = 0

        for i in range(1, n + 1):
            for j in range(1, m + 1):
                if str1[i - 1] == str2[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1] + 1
                    maxLength = max(maxLength, dp[i][j])
                else:
                    dp[i][j] = 0
        
        return maxLength