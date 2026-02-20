import java.util.Scanner;

public class minmax {

    public static int Min(int[] a) {
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int Max(int[] a) {
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int[] MinAndMax(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int num : a) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {

        int[] numbers;

        if (args.length > 0) {

            numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();

            numbers = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            scanner.close();
        }

        System.out.println("Minimum: " + Min(numbers));
        System.out.println("Maximum: " + Max(numbers));
    }
}