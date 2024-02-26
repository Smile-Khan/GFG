package String;

public class Power Set {
    

    https:import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//www.geeksforgeeks.org/problems/power-set4302/1

//{ Driver Code Starts
//Initial Template for Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> result = new ArrayList<>();
        generateSubsequences("", s, 0, result);

        // Sort the result lexicographically
        Collections.sort(result);

        return result;
    }

    private void generateSubsequences(String current, String s, int index, List<String> result) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }

        generateSubsequences(current + s.charAt(index), s, index + 1, result);
        generateSubsequences(current, s, index + 1, result);
    }
}
