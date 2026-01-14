import java.util.Scanner;
import java.util.Random;

/**
 * Utility class containing static methods for array operations.
 */
public class ArrayzUtil {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    /**
     * Creates an array of integers with the specified size and populates it
     * by asking the user for values. Each value must be <= 100.
     *
     * @param size the size of the array to create
     * @return the populated array
     */
    public static int[] setArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int value;
            do {
                System.out.print("Enter value #" + (i + 1) + " (max = 100): ");
                value = scanner.nextInt();
                if (value > 100) {
                    System.out.println("Value must be 100 or less. Try again.");
                }
            } while (value > 100);
            array[i] = value;
        }

        return array;
    }

    /**
     * Finds and returns the mode (most frequently occurring value) in the array.
     * If no number is repeated, returns -1 to indicate no mode.
     * If there are multiple modes, returns the first one found.
     *
     * @param array the array to find the mode of
     * @return the mode value, or -1 if no mode exists
     */
    public static int getMode(int[] array) {
        int mode = -1;
        int maxCount = 1;  // Need more than 1 occurrence to have a mode

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }

        return mode;
    }

    /**
     * Creates an array of random integers from 1 to 100 with the specified size.
     *
     * @param size the size of the array to create
     * @return the array filled with random integers (1-100)
     */
    public static int[] setRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;  // Random int from 1 to 100
        }

        return array;
    }

    /**
     * Prints each value in the array.
     *
     * @param array the array to print
     */
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
