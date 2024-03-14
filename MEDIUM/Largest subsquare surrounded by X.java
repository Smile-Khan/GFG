public class Largest subsquare surrounded by X {
    

    https://www.geeksforgeeks.org/problems/largest-subsquare-surrounded-by-x0558/1


}

SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            char A[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) A[i][j] = S[j].charAt(0);
            }
            Solution ob = new Solution();
            System.out.println(ob.largestSubsquare(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int largestSubsquare(int n, char a[][]) {
        // code here
        int[][] bottom = new int[n + 1][n + 1];
        int[][] right = new int[n + 1][n + 1];

        // Calculate right array
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (a[i][j] == 'X') {
                    right[i][j] = right[i][j + 1] + 1;
                }
            }
        }

        // Calculate bottom array
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (a[i][j] == 'X') {
                    bottom[i][j] = bottom[i + 1][j] + 1;
                }
            }
        }

        int ans = 0;

        // Iterate over each cell to find largest subsquare
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int len = Math.min(right[i][j], bottom[i][j]);
                while (len > 0) {
                    int x1 = i;
                    int y1 = j + len - 1;
                    int x2 = i + len - 1;
                    int y2 = j;
                    if (Math.min(bottom[x1][y1], right[x2][y2]) >= len) {
                        ans = Math.max(ans, len);
                        break;
                    } else {
                        len--;
                    }
                }
            }
        }

        return ans;
    }
};
