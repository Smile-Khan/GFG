public class Kth Distance {
    

}


📊 Detect Duplicates Within Distance (Java Solution) - #CodeOfTheDay



Summary:

In today's post, we tackle the challenge of checking for duplicates within a specified distance in an array. This solution uses a sliding window with a HashSet for O(n) efficiency, handling arrays of large sizes seamlessly. Dive into the breakdown and enhance your data structure skills!





Step-By-Step Solution



1. Understand the Problem: We need to identify if any element within an unsorted array arr appears more than once within a given distance k. If such duplicates exist, return true; otherwise, return false



2. Optimal Approach with HashSet: A HasSet allows us to store unique elements and provides O(1) average-time complexity for add, remove and contains operations. This helps us maintain only the last k elements to check duplicates efficiently.



3. Implementation Details:

 * Iterate through the array: For each element, check if it exists within the hashSet (indicating a duplicate within k distance).

 * Sliding Window Mechanism: Ensure the size of the HashSet never exceeds k by removing the earliest added element when the window reaches k + 1 size.

 * Return result: If duplicates are found within k, return true. If the loop completes without detecting any duplicates within k, return false.







Explanation of Example: 

For input arr = [1, 2, 3, 1, 4, 5] and k = 3, the function finds the number 1 at indices 0 and 3, just within the distance of 3, and returns true.




public class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }
}

