QUESTION :- Level Of Nodes {
    


    https://practice.geeksforgeeks.org/problems/level-of-nodes-1587115620/1



    SOLUTION :-

    //{ Driver Code Starts
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
          if(X==0) return 0;
        int level=0;
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int curr=q.poll();
                for(int j:adj.get(curr)){
                    if(curr==X) return level;
                    if(!vis[j]){
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
