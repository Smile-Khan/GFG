QUESTION:- Roman Number to Integer 

https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1


SOLUTION:-

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        
         int ans = 0;
        for(int i=0;i<str.length();i++){
            int s1 = value(str.charAt(i));
            if(i+1<str.length()){
                int s2 = value(str.charAt(i+1));
                if(s1>=s2){
                    ans += s1;
                }else{
                    ans = ans + s2-s1;
                    i++;
                }
            }else{
                ans += s1;
            }

        }
        return ans;
    }
    public static int value(char ch){
        
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return 0;
        }
       
    }
}