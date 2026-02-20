import java.util.Scanner;

public class string_reversed {
    public static String reverse(String input) {

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverse(original));

        scanner.close();
    }
}
