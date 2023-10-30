QUESTION :- Sum of XOR of all pairs {
    

    https://practice.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1


}


SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.sumXOR(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        
         long result = 0;  // Initialize the result to 0

        // Traverse through all bits of an integer (assuming a 32-bit integer)
        for (int bit = 0; bit < 32; bit++) {
            // Count the number of elements with the bit set at the current position
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Calculate the contribution of the current bit to the result
            // (number of 1s at the current bit * number of 0s at the current bit)
            result += (long) (1L << bit) * count * (n - count);
        }

        return result;
    }
    
    
}



