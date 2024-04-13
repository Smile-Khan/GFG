public class reverse bit {
    

    https://www.geeksforgeeks.org/problems/reverse-bits3556/1


}

SOLUTION :-
//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        long res = 0;
      int n = 32;
        for (int i = 0; i < n; i++) {
            res <<= 1;
            if ((x & 1) == 1) {
                res ^= 1;
            }
            x >>= 1;
        }
        return res;
    }
};
