import java.util.Scanner;

/**
 * Client class to test the ArrayzUtil methods.
 */
public class ArrayClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the random array
        System.out.print("How many values do you want in the random array? ");
        int size = scanner.nextInt();

        // Test setRandomArray() and printArray()
        System.out.println("\n--- Testing setRandomArray() ---");
        int[] randomArray = ArrayzUtil.setRandomArray(size);
        System.out.print("Random array: ");
        ArrayzUtil.printArray(randomArray);

        // Test getMode() on the random array
        System.out.println("\n--- Testing getMode() on random array ---");
        int mode = ArrayzUtil.getMode(randomArray);
        if (mode == -1) {
            System.out.println("No mode found (no repeated values).");
        } else {
            System.out.println("Mode: " + mode);
        }

        // Test setArray() with user input
        System.out.println("\n--- Testing setArray() ---");
        System.out.print("How many values do you want to enter manually? ");
        int manualSize = scanner.nextInt();
        int[] userArray = ArrayzUtil.setArray(manualSize);
        System.out.print("Your array: ");
        ArrayzUtil.printArray(userArray);

        // Test getMode() on the user array
        System.out.println("\n--- Testing getMode() on user array ---");
        mode = ArrayzUtil.getMode(userArray);
        if (mode == -1) {
            System.out.println("No mode found (no repeated values).");
        } else {
            System.out.println("Mode: " + mode);
        }

        scanner.close();
    }
}
