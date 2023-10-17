QUESTION :- Transitive closure of Graph 

https://practice.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1

SOLUTION :-

 ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int src=0; src<N; src++) {
            adj.add(new ArrayList<>());
            ans.add(new ArrayList<>(Collections.nCopies(N, 0)));
            for(int dest=0; dest<N; dest++) {
                if(graph[src][dest]==1) {
                    adj.get(src).add(dest);
                }
            }
        }
        
        for(int idx=0; idx<N; idx++) {
            dfs(idx, idx, new boolean[N], adj, ans);
        }
        return ans;
    }
    
    static void dfs(int src, int dest, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> ans) {
        ans.get(src).set(dest, 1);
        visited[dest] = true;
        for(int neighbor: adj.get(dest)){
            if(!visited[neighbor]){
                dfs(src, neighbor, visited, adj, ans);
            }
        }
    }
}
