import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write down the number of invoices: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice #" + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Part Description: ");
            String partDescription = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\nInvoice Info:");

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice #" + (i + 1));
            System.out.println("Part: " + invoices[i].getPartDescription());
            System.out.println("Amount: $" + invoices[i].getInvoiceAmount());
            System.out.println();
        }

        scanner.close();
    }
}