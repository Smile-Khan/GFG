package Array;

import java.util.Arrays;

public class Maximize Array Value After Rearrangement {
    
    QUESTION :- 

    https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1


}

SOLUTION: -

class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        // Sort the Array
        Arrays.sort(arr);
        
        // Initialize variables
        long result = 0;
        int mod = 1000000007;
        for(int i = 0; i<arr.length; i++)
        {
            
            result = (result + (long) arr[i] * i)%mod;
        }
        // return the final result
        return (int) result;
    }
}
