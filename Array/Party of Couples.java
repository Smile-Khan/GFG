package Array;

public class Party of Couples {
 
    https://www.geeksforgeeks.org/problems/alone-in-couple5507/1

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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        int single = 0;
        
        for(int num : arr)
        {
            single ^= num;
        }
        return single;
    }
}
