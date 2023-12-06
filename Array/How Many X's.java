package Array;
QUESTION :-  class How Many X's {
    

    https://www.geeksforgeeks.org/problems/how-many-xs4514/1

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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.countX(L, R, X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countX(int L, int R, int X) {
        // code here
        
        int count = 0;
        
        for(int i = L+1; i<R; i++)
        {
            int num = i;
            while(num != 0)
            {
                int digit = num % 10;
                if(digit == X)
                {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
};
