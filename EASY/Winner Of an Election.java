public class Winner Of an Election {
    

https://www.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1
    

}


SOLUTION :-

//{ Driver Code Starts
import java.util.HashMap;
import java.util.Scanner;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        
        HashMap<String, Integer> votesCount = new HashMap<>();
        
        // Traverse the array and count the votes for each candidate
        
        for(String candidate : arr)
        {
            votesCount.put(candidate, votesCount.getOrDefault(candidate,0)+1);
        }
        
        // Find the candidate with maximum votes and lexicographiccally smalles name
        
        String winner = "";
        int maxVotes = 0;
        
        for(String candidate : votesCount.keySet())
        {
            int votes = votesCount.get(candidate);
            
            if(votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner)<0))
            {
                winner = candidate;
                maxVotes = votes;
            }
        }
        // Return the result as an array
        String[] result = {winner,String.valueOf(maxVotes)};
        
        return result;
    }
}


