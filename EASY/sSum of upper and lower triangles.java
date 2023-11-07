QUESTION :- sSum of upper and lower triangles {
    

    https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1


}


SOLUTION  :-

//{ Driver Code Starts
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
         int upperSum = 0,lowerSum = 0;
                for(int i=0 ; i<n ; i++)
                {
                 for(int j=0+i ; j<n ; j++)
                 {
               upperSum += matrix[i][j];
                     
                 }
                 for(int j=0 ; j<i+1 ; j++)
                 {
               lowerSum += matrix[i][j];
                     
                 }
    }
    res.add(upperSum);
    res.add(lowerSum);
    return res;
    }
}
