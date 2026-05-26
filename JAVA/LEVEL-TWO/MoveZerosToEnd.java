public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] numbers) {
        int[] result = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number != 0) {
                result[index++] = number;
            }
        }

        return result;
    }


}
