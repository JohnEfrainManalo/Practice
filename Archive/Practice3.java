package Archive;
import java.util.Scanner;
public class Practice3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int itemNumber;
        double baseTotal = 0, 
               bulkDiscount = 0, 
               premiumDiscount = 0, 
               shippingFee = 0, 
               amountDue = 0;
        String premiumMembership;
        boolean freeShipping = true;
        double [] items;

        System.out.println("=== RETAIL CHECKOUT SYSTEM ===");
        System.out.print("\nEnter the number of items in your cart: ");
        itemNumber = input.nextInt();
        
        items = new double[itemNumber];
        System.out.println();
        for(int i = 0; i<itemNumber; i++){
            System.out.print("Enter the price for Item #" + (i+1) + ": ");
            items[i] = input.nextDouble();
        }

        System.out.print("\nDo you have a premium membership? (Y/N): ");
            premiumMembership = input.next();

        for(int i = 0; i<itemNumber; i++){
            baseTotal += items[i];
        }

        if(baseTotal >= 5000 && premiumMembership == "Y"){
            bulkDiscount = baseTotal * 0.15; 
            premiumDiscount = baseTotal * 0.05;
        }
        else if (baseTotal >= 5000){
            bulkDiscount = baseTotal * 0.15;
        }

        amountDue = baseTotal - bulkDiscount - premiumDiscount;

        if(amountDue < 1000.00){
            shippingFee = 150.00;
            freeShipping = false;
        }

/*
        // Sample data
        baseTotal = 100.0056;
        bulkDiscount = 123.00;
        premiumDiscount = 1234.23;
        shippingFee = 123123123.12;
        amountDue = 9999.99;
        freeShipping = true;
        //====================
 */
        System.out.println("\n--- FINAL RECEIPT ---");
        System.out.printf("%-18s %.2f php %-18s%n", "Base Total:", baseTotal, "");
        System.out.printf("%-18s-%.2f php %-18s%n", "Bulk Discount:", bulkDiscount, "(15% off)");
        System.out.printf("%-18s-%.2f php %-18s%n", "Premium Discount:", premiumDiscount, "(5% off)");
        System.out.printf("%-18s %.2f php %-18s%n", "Shipping Fee:", shippingFee, freeShipping ? "(Free)" : "");
        System.out.println("----------------------------");
        System.out.printf("%-18s %.2f php%n", "Amount Due:", amountDue); // Removed the extra %-18s here






        input.close();
    }
}
