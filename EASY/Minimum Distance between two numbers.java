QUESTION :- Minimum Distance between two numbers {
    

    https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1


}


SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int minDistance = Integer.MAX_VALUE;
        int lastIndexX = -1;
        int lastIndexY = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                if (lastIndexY != -1) {
                    minDistance = Math.min(minDistance, i - lastIndexY);
                }
                lastIndexX = i;
            } else if (a[i] == y) {
                if (lastIndexX != -1) {
                    minDistance = Math.min(minDistance, i - lastIndexX);
                }
                lastIndexY = i;
            }
        }

        return (minDistance != Integer.MAX_VALUE) ? minDistance : -1;
    }
}
