QUESTION :- Inorder Traversal and BST {
    

    https://www.geeksforgeeks.org/problems/inorder-traversal-and-bst5855/1


}

Solution :-

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isRepresentingBST(arr, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        if(N == 1 || N == 0)
        {
            return 1;
        }
        
        for(int i = 0; i<N-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return 0;
            }
        }
        if(arr[N-2] > arr[N-1])
        {
            return 0;
        }
        return 1;
    }
}
