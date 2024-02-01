public class Panagram Checking {
    

    https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1


}

SOLUTION :-

//{ Driver Code Starts
//Initial template for JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        
        // Create a boolean array to mark the presence of each letter in the alphabet
        boolean[] isPresent = new boolean[26];

        // Traverse the input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an uppercase letter, convert it to lowercase
            if ('A' <= ch && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }

            // Mark the presence of the character in the array
            if ('a' <= ch && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters are present in the array
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends
