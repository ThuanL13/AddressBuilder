import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Asking for user info
        System.out.println("What is your full name?: ");
        String fullName = read.nextLine();

        // Creating the stringbuilder for address
        //Creates empty stringbuilder
        StringBuilder billingAddress = new StringBuilder();

        // Asking for address to append to billing st
        System.out.println("Billing Street: ");
        // First append adds to end of stringbuilder
        // Second append is chained, moving to a new line
        // Method 1, method 2, method 3 are chained
        billingAddress.append(read.nextLine()).append("\n");

        // Billing City
        System.out.println("Billing City: ");
        String billingCity = read.nextLine();

        // Billing State
        System.out.println("Billing State: ");
        String billingState = read.nextLine();

        //Billing Zipcode
        System.out.println("Billing Zipcode: ");
        String billingZip = read.nextLine();

        // Appending city, state, and zip to billing address
        billingAddress.append(billingCity)
                .append(", ")
                .append(billingState)
                .append(" ")
                .append(billingZip);

        // Stringbuilder for *Shipping* address
        StringBuilder shippingAddress = new StringBuilder();

        // Asking for shipping address to append to shipping st
        System.out.println("Shipping Street: ");
        shippingAddress.append(read.nextLine()).append("\n");
        // Asking for city, state, zip
        System.out.println("Shipping City: ");
        String shippingCity = read.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = read.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = read.nextLine();

        // Appending to shipping st
        shippingAddress.append(shippingCity)
                .append(", ")
                .append(shippingState)
                .append(" ")
                .append(shippingZip);

        // Displaying info
        System.out.println("\n" + fullName);
        System.out.println("Billing Address: ");
        System.out.println(billingAddress);
        System.out.println("\nShipping Address: ");
        System.out.println(shippingAddress);

        read.close();
    }
}
