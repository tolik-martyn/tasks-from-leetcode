package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt1(String s) {
        int[] values = new int[22]; // 'X' - 'C' + 1 = 22
        values[6] = 1; // 'I' - 'C' = 6
        values[19] = 5; // 'V' - 'C' = 19
        values[21] = 10; // 'X' - 'C' = 21
        values[9] = 50; // 'L' - 'C' = 9
        values[0] = 100; // 'C' - 'C' = 0
        values[1] = 500; // 'D' - 'C' = 1
        values[10] = 1000; // 'M' - 'C' = 10

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values[s.charAt(i) - 'C'];
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
                prevValue = currentValue;
            }
        }

        return result;
    }

    public int romanToInt2(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
                prevValue = currentValue;
            }
        }
        return result;
    }
}