import java.util.Arrays;

public class PerfectSquares {
    public static int[] getPerfectSquares(int[] numbers) {
        int count = 0;

        for (int indices : numbers) {
            int root = (int) Math.sqrt(indices);
            if (root * root == indices) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int indices : numbers) {
            int root = (int) Math.sqrt(indices);
            if (root * root == indices) {
                result[index++] = indices;
            }
        }

        return result;
    }

  
}
