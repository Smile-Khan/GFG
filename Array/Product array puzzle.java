public class Product array puzzle {
    
    QUESTION LINK: -

    https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

}

SOLUTION:-
-----------------JAVA--------------

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        long[] left = new long[n];
        long[] right = new long[n];
        long[] prod = new long[n];
        
        // Initializeing the first element of left and last right
        left[0] = 1;
        right[n - 1] = 1;
        
        // Left product array
        for(int i = 1; i<n; i++)
        {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        // Right product array
        for(int i = n - 2; i >= 0; i--)
        {
            right[i] = nums[i + 1] * right[i + 1];
        }
        
        // Constructing the product array
        for(int i = 0; i<n; i++)
        {
            prod[i] = left[i] * right[i];
        }
        
        return prod;
    }
}









------------PYTHON----------------
class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        left = [1] * n
        right = [1] * n
        prod = [1] * n

        # Left product array
        for i in range(1, n):
            left[i] = nums[i - 1] * left[i - 1]

        # Right product array
        for i in range(n - 2, -1, -1):
            right[i] = nums[i + 1] * right[i + 1]

        # Constructing the product array
        for i in range(n):
            prod[i] = left[i] * right[i]

        return prod
