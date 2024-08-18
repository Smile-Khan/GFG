public class Split an array into two equal Sum subarrays {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1


}

------------------------------------------JAVA------------------------------------

class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int totalSum = 0;
        for(int num : arr)
        {
            totalSum += num;
        }
        
        // If total sum is odd, return false
        if(totalSum % 2 != 0)
        {
            return false;
        }
        
        int leftSum = 0;
        for(int num : arr)
        {
            leftSum += num;
            if(leftSum == totalSum/2)
            {
                return true;
            }
        }
        return false;
    }
}


---------------------------PYTHON-------------------------

class Solution:
    def canSplit(self, arr):
        total_sum = sum(arr)

        # If total sum is odd, return false
        if total_sum % 2 != 0:
            return False

        left_sum = 0
        for num in arr:
            left_sum += num
            if left_sum == total_sum // 2:
                return True

        return False

