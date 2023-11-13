package palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        // Числа меньше 0 или оканчивающиеся на 0 не являются палиндромами
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }

        int reversedNumber = 0;
        int originalNumber = x;


        while (originalNumber > 0) {
            reversedNumber = reversedNumber * 10 + (originalNumber % 10);
            originalNumber /= 10;
        }

        return x == reversedNumber;
    }
}
