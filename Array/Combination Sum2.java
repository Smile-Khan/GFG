package Array;

import java.util.ArrayList;
import java.util.List;

public class Combination Sum2 {
    
    https://www.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1
    
}
SOLUTION :-

Arrays.sort(arr);
List<List<Integer>> res = new ArrayList<>();
helper(arr, k, res, new ArrayList<>(), 0, 0);
return res;
}

private void helper(int[] arr, int k, List<List<Integer>> res, List<Integer> list, int sum, int ind){
if(sum > k) return;
if(sum == k){
    res.add(list);
    return;
}
for(int i=ind; i<arr.length; i++){
    if(i > ind && arr[i] == arr[i - 1]) continue;
    list.add(arr[i]);
    sum += arr[i];
    helper(arr, k, res, new ArrayList<>(list), sum, i+1);
    list.remove(list.size()-1);
    sum -= arr[i];
}