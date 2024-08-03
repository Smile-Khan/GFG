package Array;

public class The Celebrity Problem {
 
    
    https://www.geeksforgeeks.org/problems/the-celebrity-problem/1


}

SOLUTION :-

USING ARRAY :-

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int candidate = 0;
        
        // Iterate through the matrix
        for(int i = 0; i < n; i++)
        {
            if(mat[candidate][i] == 1)
            {
                candidate = i;
            }
        }
        
        // Second pass: Verify if the candidate is a celebrity 
        for(int i = 0;i<n; i++)
        {
            if(i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0))
            {
                return -1;
            }
        }
        return candidate;
    	        }
    	    }
    	}

        // USING HASHMAP 

        //int celebrity(int M[][], int n)
    // {
    // 	// code here 
    // 	HashMap<Integer, Integer> hMap = new HashMap<>();
    	
    // 	for(int i=0; i<n; i++)
    // 	{
    // 	    for(int j=0; j<n; j++)
    // 	    {
    // 	        if(M[i][j] == 1)
    // 	        {
    // 	            hMap.put(i,hMap.getOrDefault(i,0)+1);
    // 	        }
    // 	    }
    // 	}
    	
    	// Make map to know a person is known by how many person
    	
    // 	HashMap<Integer, Integer> hMap1 = new HashMap<>();
    	
    // 	for(int i=0; i<n; i++)
    // 	{
    // 	    int count = 0;
    // 	    for(int j=0; j<n; j++)
    // 	    {
    // 	        if(M[j][i] == 1)
    // 	        {
    // 	            count++;
    // 	        }
    // 	    }
    // 	    hMap1.put(i,count);
    // 	}
    // 	//Check if a person is known by n-1 person and he knows no one
    // 	for(int i=0; i<n; i++)
    // 	{
    // 	    if(hMap1.get(i) == n-1 && hMap.getOrDefault(i,0) == 0)
    // 	    {
    // 	        return i;
    // 	    }
    // 	}
    // 	return -1;
    }
}