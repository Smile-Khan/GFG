package String;

public class Sum of all substrings of a number {
    
    https:import java.util.Scanner;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code here
    int MOD=1000000007;
    long prev=0;
    long curr=0;
    long sum=0;
    
    for(int i=0; i<s.length(); i++){
        curr=((s.charAt(i)-'0')*(i+1))%MOD + (prev*10)%MOD;
        sum=(sum+curr)%MOD;
        prev=curr;
    }
    return sum; 
    }
}
