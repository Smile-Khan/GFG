package Array;

public class K-th element of two Arrays {
    
}

QUESTION LINK: -

https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

//{ Driver Code Starts
// Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        return KtEhelper(arr1, arr1.length, arr2, arr2.length, k);
    }
    
    // Create a HELPER functio to find kthElement
    private long KtEhelper(int[] arr1, int n1, int[] arr2, int n2, int k)
    {
        // Ensure arr1 is the smaller array to minimize the search space
        
        if(n1 > n2)
        {
            return KtEhelper(arr2, n2,arr1,n1,k);
        }
        
        // Base case
        if(n1 == 0)
        {
            return arr2[k - 1];
        }
        // if "K" is 1 return the minimum of the first elements of "ARR1" and "ARR2"
        if(k == 1)
        {
            return Math.min(arr1[0], arr2[0]);
        }
        
        // Divide k into two parts
        
        int i = Math.min(n1, k / 2);
        int j = Math.min(n2, k / 2);
        
        if(arr1[i - 1] < arr2[j - 1])
        {
            // Exclude first i elements of arr1 and adjust k
            int[] newArr1 = new int[n1 - i];
            
            System.arraycopy(arr1, i, newArr1, 0, n1 - i);
            
            return KtEhelper(newArr1, n1 - i, arr2, n2, k - i);
        }
        else 
        {
            // Exclude first j elements of arr2 and adjust k
            int[] newArr2 = new int[n2 - j];
            System.arraycopy(arr2, j, newArr2, 0, n2 - j);
            
            return KtEhelper(arr1, n1, newArr2, n2 - j, k - j);
        }
    }
}