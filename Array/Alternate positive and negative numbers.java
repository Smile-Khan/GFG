import java.util.ArrayList;

public class Alternate positive and negative numbers {
    
    QUESTION LINK:
    https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

}

SOLUTION:

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);  // Positive includes zero
            } else {
                negative.add(num);  // Negative numbers
            }
        }

        // Rearrange the array
        int posIndex = 0, negIndex = 0;
        int i = 0;
        
        // Alternate between positive and negative
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (i % 2 == 0) {
                arr.set(i, positive.get(posIndex++));
            } else {
                arr.set(i, negative.get(negIndex++));
            }
            i++;
        }
        
        // Append remaining positive elements, if any
        while (posIndex < positive.size()) {
            arr.set(i++, positive.get(posIndex++));
        }

        // Append remaining negative elements, if any
        while (negIndex < negative.size()) {
            arr.set(i++, negative.get(negIndex++));
        }
        
    }
}
