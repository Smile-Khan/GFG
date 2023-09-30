QUESTION :-  Boolean Matrix

https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1

ANSWER :- 

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
         int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasOne = false;
        boolean firstColHasOne = false;

        // Check if the first row has a 1
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 1) {
                firstRowHasOne = true;
                break;
            }
        }

        // Check if the first column has a 1
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 1) {
                firstColHasOne = true;
                break;
            }
        }

        // Mark rows and columns to be modified
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }

        // Modify rows based on the first column
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 1) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Modify columns based on the first row
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 1) {
                for (int i = 1; i < rows; i++) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Modify the first row if needed
        if (firstRowHasOne) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 1;
            }
        }

        // Modify the first column if needed
        if (firstColHasOne) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 1;
            }
        }
    }
}