QUESTION :-

https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1


SOLUTION :-

//{ Driver Code Starts
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key)>1){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        if(ans.isEmpty()){
            ans.add(-1);
        }
        
        return ans;
    }
}
