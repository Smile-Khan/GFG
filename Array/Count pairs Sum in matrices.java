package Array;

public class Count pairs Sum in matrices {
    

    https://www.geeksforgeeks.org/problems/count-pairs-sum-in-matrices4332/1

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        
        int ans = 0;
        
        // Initialize the variables to traverse the matrices
        int row1 = 0, col1 = 0, row2 = n - 1, col2 = n - 1;
        
        // Traverse the matrices
        while (row1 < n && row2 >= 0) {
            int val = mat1[row1][col1] + mat2[row2][col2];
            
            // If the val is equal to x, increment the answer and move to the next elements
            if (val == x) {
                ans++;
                col1++;
                col2--;
            }
            
            // If the val is greater than x, decrease col2
            if (val > x) {
                col2--;
            }
            
            // If the val is less than x, increase col1
            if (val < x) {
                col1++;
            }
            
            // If col1 goes out of the matrix, move to the next row
            if (col1 == n) {
                row1++;
                col1 = 0;
            }
            
            // If col2 goes out of the matrix, move to the previous row's last element
            if (col2 == -1) {
                row2--;
                col2 = n - 1;
            }
        }
        
        return ans;
    }
}
