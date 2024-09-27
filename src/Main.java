import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping cost: " + shippingCost);
        System.out.println("Total price: " + totalPrice);
    }
}