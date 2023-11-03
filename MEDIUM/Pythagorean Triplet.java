QUESTION :- Pythagorean Triplet {
    

    https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1


}

SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<n; i++)
        {
            list.add(arr[i]);
        }
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i != j)
                {
                    int result = (arr[i]*arr[i])+(arr[j]*arr[j]);
                    
                    double result1 = Math.sqrt(result);
                    
                    double result2 = Math.floor(result1);
                    
                    if(result1 == result2)
                    {
                        if(list.contains((int)result2))
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
