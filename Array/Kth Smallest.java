public class Kth Smallest {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1


}

-------------------JAVA--------------------

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int maxElement = 1000000; // as per constraints
        int[] count = new int[maxElement + 1];
        
        // Count Frequency
        for(int num : arr)
        {
            count[num]++;
        }
        
        // Find the kth smallest element
        int countC = 0;
        for(int i = 0; i<= maxElement; i++)
        {
            countC +=  count[i];
            if(countC >= k)
            {
                return i;
            }
        }
        return -1; // In case k is not valid
    }
}

