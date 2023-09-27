 QUESTION:- Find the closest pair from two arrays 

 https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1


 SOLUTION :-

 //{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        
        int i=0,j=m-1;
        int sum=0,diff=0;
        int temp=Math.abs(x-(arr[0]+brr[0]));
        int[] ans=new int[2];
        ans[0]=arr[0];
        ans[1]=brr[0];
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(i<n && j>=0){
            sum=arr[i]+brr[j];
            diff=Math.abs(x-sum);
            if(sum==x){
                res.add(arr[i]);
                res.add(brr[j]);
                return res;
            }
            else if(diff<temp){
                temp=diff;
                ans[0]=arr[i];
                ans[1]=brr[j];
            }
            if(sum<x){
                i++;
            }
            else{
                j--;
            }
        }
        res.add(ans[0]);
        res.add(ans[1]);
        return res;
    }
}
