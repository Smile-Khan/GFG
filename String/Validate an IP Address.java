package String;

public class Validate an IP Address {
 
    QUESTION LINK :-

    https:import java.util.Scanner;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] parts = str.split("\\.");
        
        if (parts.length != 4)
        {
            return false;
        }
        for (String part : parts)
        {
            if (part.isEmpty() || part.length() > 1 && part.startsWith("0"))
            {
                return false;
            }
            
            int num;
            try
            {
                num = Integer.parseInt(part);
            } catch (NumberFormatException e)
            {
                return false;
            }
            if (num < 0 || num > 255)
            {
                return false;
            }
        }
        
        return true;
    }
}
