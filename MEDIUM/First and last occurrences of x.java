QUESTION : - 

https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1


SOLUTION :- 


//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        
       ArrayList<Integer> result = new ArrayList<>();
        int first = -1, last = -1;
        int left = 0, right = n - 1;

        // Find the first occurrence of x using binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = n - 1;

        // Find the last occurrence of x using binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        result.add(first);
        result.add(last);
        return result;
        
        
        
        
        
        
        
        // Alternate approach 
        
        
        //   ArrayList<int> result = new ArrayList<>();
        // int first = -1, last = -1;
        // int left = 0, right = n - 1;

        // // Binary search to find the first occurrence of x
        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     if (arr[mid] == x) {
        //         first = mid;
        //         right = mid - 1;
        //     } else if (arr[mid] < x) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }

        // // If first occurrence was not found, return [-1, -1]
        // if (first == -1) {
        //     result.add(-1L);
        //     result.add(-1L);
        //     return result;
        // }

        // // Linearly find the last occurrence of x
        // int i = (int) first;
        // while (i < n && arr[i] == x) {
        //     last = i;
        //     i++;
        // }

        // result.add(first);
        // result.add(last);
        // return result;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends