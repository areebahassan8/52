import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== MY STORE =====");
        System.out.println("1. Mobile - Rs. 25000");
        System.out.println("2. Headphones - Rs. 2000");
        System.out.println("3. Charger - Rs. 1000");

        System.out.print("Product number select karein: ");
        int choice = input.nextInt();

        System.out.print("Quantity enter karein: ");
        int quantity = input.nextInt();

        int price = 0;
        String product = "";

        switch (choice) {
            case 1:
                product = "Mobile";
                price = 25000;
                break;
            case 2:
                product = "Headphones";
                price = 2000;
                break;
            case 3:
                product = "Charger";
                price = 1000;
                break;
            default:
                System.out.println("Invalid product!");
                input.close();
                return;
        }

        int total = price * quantity;

        System.out.println("\n===== YOUR BILL =====");
        System.out.println("Product: " + product);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: Rs. " + total);

        input.close();
    }
}