package Array;

public class Spirally traversing a matrix {
    
    QUESTION :- 

    https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

//{ Driver Code Starts
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
    
    class GFG {
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
    
            while (t-- > 0) {
                int r = sc.nextInt();
                int c = sc.nextInt();
    
                int matrix[][] = new int[r][c];
    
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
                }
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
                for (Integer val : ans) System.out.print(val + " ");
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        // Function to return a list of integers denoting spiral traversal of matrix.
        public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
            // code here
            ArrayList<Integer> result = new ArrayList<>();
            if(matrix == null || matrix.length == 0)
            return result;
            
            int rows = matrix.length;
            int cols = matrix[0].length;
            int top = 0;
            int bottom = rows - 1;
            int left = 0;
            int right = cols - 1;
            
            while(top <= bottom && left <= right)
            {
                // Traverse from LEFT to RIGHT
                for(int i = left; i <= right; i++)
                {
                    result.add(matrix[top][i]);
                }
                top++;
                if(top > bottom)
                break;
                
                // Traverse from TOP to BOTTOM
                for(int i = top; i <= bottom; i++)
                {
                    result.add(matrix[i][right]);
                }
                right--;
                if(left > right)
                break;
                
                // Traverse from RIGHT to LEFT;
                for(int i = right; i >= left; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                if(top > bottom)
                break;
                
                // Traverse from BOTTOM to TOP
                for(int i = bottom; i>= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            return result;
        }
    }
    
