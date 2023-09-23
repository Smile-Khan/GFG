QUESTION :- 

https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

SOLUTION :-

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        if(n == 1)
        {
            return 1;
        }
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        long leftSum = 0;
        long rightSum = 0;
        
        for(int i=0; i<n; i++)
        {
            leftSum += arr[i];   //sum of all array elements uptill index i
            rightSum = sum - leftSum;       //sum of array elements to its right
            if(leftSum - arr[i] == rightSum)    //comparing the condition of eqb.
            {
                return i+1;
                
            }
        }
        return -1;
    }
}
