public class Sequence of Sequence {
 
    
        https://www.geeksforgeeks.org/problems/sequence-of-sequence1155/1


}

SOLUTION :-

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
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberSequence(int m, int n)
    {
        // code here
        
        if(m < n)
        {
            return 0;
        }
        
        if(n == 0)
        {
            return 1;
        }
        return numberSequence(m/2, n-1)+numberSequence(m-1,n);
    }
}
