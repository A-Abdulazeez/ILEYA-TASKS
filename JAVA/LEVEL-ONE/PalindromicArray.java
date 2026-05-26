public class PalindromicArray {
    static boolean isPalindromic(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] != numbers[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
