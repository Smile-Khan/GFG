QUESTION :- Top K Frequent Elements in Array {
    

    https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1


}

SOLUTION :-

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        
       Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        frequencyList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey(); // Larger element has higher preference.
            }
            return b.getValue() - a.getValue();
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequencyList.get(i).getKey();
        }
        
        return result;
    }
}
