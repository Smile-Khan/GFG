public class 1291. Sequential Digits {
    

    https://leetcode.com/problems/sequential-digits/description/?envType=daily-question&envId=2024-02-02

import java.util.ArrayList;
import java.util.List;

}

SOLUTION :-

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    a.add(num);
                }
                ++nextDigit;
            }
        }

        a.sort(null);
        return a;
    }
}
