QUESTION :- Wave Array 
https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1


SOLUTION :-

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] a = IntArray.input(br, n);
            
            Solution obj = new Solution();
            obj.convertToWave(n, a);
            StringBuffer sb=new StringBuffer("");
            for(int i : a){
                sb.append(i+" ");
            }
            System.out.println(sb.toString());
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        
            // arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
       /*From above sequence ,every element that is greater than its adjacent element 
       has even index no. while others has odd index no.*/        for(int i=0;i<n-1;i++){
            if(a[i] < a[i+1] && i%2==0){ 
            // if current element index no is even and smaller than next element then swap both;
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        // if currentelement index no is odd and larger than next element then swap both;
            else if(a[i] > a[i+1] && i%2 !=0){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
}
        
