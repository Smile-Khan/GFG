package Array;

public class First element to occur k times {
 
    
    https:import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1

//{ Driver Code Starts
import java.util.LinkedHashMap;
    
    public class GfG { 
        public static void main (String[] args) throws IOException  {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int k = Integer.parseInt(inputLine[1]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
                
                Solution obj = new Solution();
                System.out.println(obj.firstElementKTime(n, k, arr));
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution
    {
        public int firstElementKTime(int n, int k, int[] a) { 
             LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
             for(int i:a){
             if(map.containsKey(i)){
                 map.put(i,map.get(i)+1);
                 if(map.get(i)==k){
                     return i;
                 }
             }else{
                 map.put(i,1);
             }
             }
            
             return -1;
        } 
    }
