public class Sum of bit differences {
    
    https://www.geeksforgeeks.org/problems/sum-of-bit-differences2937/1

}


SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    long sumBitDifferences(int[] arr, int n) {
        // code here
        long count = 0;
        for (int i = 0; i < 32; i++) { // Iterate through each bit position
            int countSetBits = 0;
            int countUnsetBits = 0;

            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    countSetBits++;
                } else {
                    countUnsetBits++;
                }
            }

            count += (long) countSetBits * countUnsetBits * 2;
        }
        return count;
    }
}
