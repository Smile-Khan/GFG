package EASY;

public  {
    
}

Question Link :- (Count number of hops)  https:import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        
        if(n <= 1)
        return 1;
        if(n == 2)
        return 2;
        
        long a = 1;
        long b = 1;
        long c = 2;
        long mod = 1000000007;
        
        for(int i = 3; i<= n; i++)
        {
            long temp = (a + b + c) % mod;
            
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
    
}

