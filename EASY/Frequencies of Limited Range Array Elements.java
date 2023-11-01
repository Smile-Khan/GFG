QUESTION :- Frequencies of Limited Range Array Elements {
    

    https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1


}



SOLUTION :-

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
         HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            //if value at arr[i] is <= P, we put it in our HashMap
            if(arr[i] <= P){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
        }

        //Updating the given array
        for(int i =1; i<= arr.length; i++){
            if(map.containsKey(i)){
                arr[i-1] = map.get(i);
            }else{
                arr[i-1] = 0;
            }
    }
}
}

