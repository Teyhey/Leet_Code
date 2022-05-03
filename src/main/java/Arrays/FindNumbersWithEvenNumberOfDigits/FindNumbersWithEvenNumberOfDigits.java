package Arrays.FindNumbersWithEvenNumberOfDigits;

public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int evenDigitNumberCounter = 0;
        for (int number : nums) {
            if (String.valueOf(number).length() % 2 == 0) {
                evenDigitNumberCounter++;
            }
        }
        return evenDigitNumberCounter;
    }
}

