import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] firstNumbers = { 2, 3, 5 };
        int[] secondNumbers = { 7, 11, 13 };

        int[] allNumbers = new int[firstNumbers.length + secondNumbers.length];
        System.arraycopy(firstNumbers, 0, allNumbers, 0, firstNumbers.length);
        System.arraycopy(secondNumbers, 0, allNumbers, firstNumbers.length, secondNumbers.length);
//allNumbers is { 2, 3, 5, 7, 11, 13 }
        System.out.println(Arrays.toString(allNumbers));
    }
}
