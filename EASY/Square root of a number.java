import Tree.root;

public class Square root of a number {
    

    QUESTION LINK: -

    https://www.geeksforgeeks.org/problems/square-root/1

}

-------------------- JAVA CODE --------------

class Solution {
    long floorSqrt(long n) {
        // Your code here
        if(n == 0 || n == 1)
        {
            return n;
        }
        
        long low = 1;
        long high = n;
        long ans = 0;
        
        while(low <= high)
        {
            long mid = (low + high) / 2;
            
            // if mid * mid == n, mid is the square root
            if(mid * mid == n)
            {
                return mid;
            }
            
            // if mid * mid < n, discard left search space
            if(mid * mid < n)
            {
                low = mid + 1;
                ans = mid;
            }
            else 
            {
                // if mid * mid > n, discard right
                high = mid - 1;
            }
        }
        return ans;
    }
}


---------------------------------------------PYTHON----------------------------

class Solution:
    def floorSqrt(self, n):
        if n == 0 or n == 1:
            return n

        low, high = 1, n
        ans = 0

        while low <= high:
            mid = (low + high) // 2

            # If mid*mid == n, mid is the square root
            if mid * mid == n:
                return mid

            # If mid*mid < n, discard left search space
            if mid * mid < n:
                low = mid + 1
                ans = mid
            else:
                # If mid*mid > n, discard right search space
                high = mid - 1

        return ans
