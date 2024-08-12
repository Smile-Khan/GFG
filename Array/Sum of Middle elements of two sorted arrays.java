public class Sum of Middle elements of two sorted arrays {
    
    QUESTION LINK: -

    https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1


}

SOLUTION: -

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code n - mid1 - 1;
        
        int n = arr1.length;
        int low = 0;
        int high = n - 1;
        
        while(low <= high)
        {
            int mid1 = (low + high) / 2;
            int mid2 = n - mid1 - 2;
            
            int left1 = (mid1 >= 0) ? arr1[mid1] : Integer.MIN_VALUE;
            int left2 = (mid2 >= 0) ? arr2[mid2] : Integer.MIN_VALUE;
            
            int right1 = (mid1 + 1 < n) ? arr1[mid1 + 1] : Integer.MAX_VALUE;
            int right2 = (mid2 + 1 < n) ? arr2[mid2 + 1] : Integer.MAX_VALUE;
            
            if(left1 <= right2 && left2 <= right1)
            {
                return Math.max(left1, left2) + Math.min(right1, right2);
            }
            else if(left1 > right2)
            {
                high = mid1 - 1;
            }
            else
            {
                low = mid1 + 1;
            }
        }
        return -1; // If in case
    }
}


// PYTHON CODE 

class Solution:
    def SumofMiddleElements(self, arr1, arr2):
        n = len(arr1)
        low, high = 0, n - 1

        while low <= high:
            mid1 = (low + high) // 2
            mid2 = n - mid1 - 2

            left1 = arr1[mid1] if mid1 >= 0 else float('-inf')
            left2 = arr2[mid2] if mid2 >= 0 else float('-inf')

            right1 = arr1[mid1 + 1] if mid1 + 1 < n else float('inf')
            right2 = arr2[mid2 + 1] if mid2 + 1 < n else float('inf')

            if left1 <= right2 and left2 <= right1:
                return max(left1, left2) + min(right1, right2)
            elif left1 > right2:
                high = mid1 - 1
            else:
                low = mid1 + 1

        return -1  # Should not reach here for valid input


if __name__ == "__main__":
    solution = Solution()
    arr1 = [1, 2, 4, 6, 10]
    arr2 = [4, 5, 6, 9, 12]
    print(solution.SumofMiddleElements(arr1, arr2))  # Output: 11