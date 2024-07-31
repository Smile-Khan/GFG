package String;

public class Longest Common Prefix of Strings {
    
        QUESTION LINK :- 

        https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1

//{ Driver Code Starts
// Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        // Base case
        if (arr.length == 0) {
            return "-1";
        }

        // Find the shortest string in the array
        String shortStr = arr[0];
        for (String str : arr) {
            if (str.length() < shortStr.length()) {
                shortStr = str;
            }
        }

        // Iterate through the characters of the shortest string
        for (int i = 0; i < shortStr.length(); i++) {
            char ch = shortStr.charAt(i);
            for (String str : arr) {
                if (i >= str.length() || str.charAt(i) != ch) {
                    // Mismatch found, return the common prefix
                    if(i == 0)
                    {
                        return "-1";
                    }
                    else 
                    {
                    return shortStr.substring(0, i);
                    }
                }
            }
        }

        // No mismatch found, return the entire shortest string
        return shortStr;
    }
}
