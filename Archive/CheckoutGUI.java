package Archive;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutGUI {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Retail Checkout System");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2, 10, 10)); // Grid layout: 6 rows, 2 columns

        // Create UI components
        JLabel priceLabel = new JLabel(" Item Price (php):");
        JTextField priceInput = new JTextField();

        JLabel premiumLabel = new JLabel(" Premium Member?");
        JCheckBox premiumCheck = new JCheckBox("Yes, I am a premium member");

        JButton calculateButton = new JButton("Calculate Total");
        
        // Text area to act as our receipt screen
        JTextArea receiptArea = new JTextArea();
        receiptArea.setEditable(false);
        receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Keeps columns aligned

        // Add components to the frame
        frame.add(priceLabel);
        frame.add(priceInput);
        frame.add(premiumLabel);
        frame.add(premiumCheck);
        frame.add(new JLabel(" Click to process:"));
        frame.add(calculateButton);
        frame.add(new JLabel(" Final Receipt:"));
        frame.add(new JScrollPane(receiptArea)); // Wrap text area in a scroll pane

        // Add action logic to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Get the values from the display fields
                    double baseTotal = Double.parseDouble(priceInput.getText());
                    boolean isPremium = premiumCheck.isSelected();
                    
                    double bulkDiscount = 0;
                    double premiumDiscount = 0;
                    double shippingFee = 0;

                    // 2. Run the exact logic calculations
                    if (baseTotal >= 5000) {
                        bulkDiscount = baseTotal * 0.15;
                    }
                    if (isPremium) {
                        premiumDiscount = baseTotal * 0.05;
                    }

                    double amountDue = baseTotal - bulkDiscount - premiumDiscount;

                    String shippingLabel = "(Free)";
                    if (amountDue < 1000.00) {
                        shippingFee = 150.00;
                        shippingLabel = "";
                    }
                    amountDue += shippingFee;

                    // 3. Build and display the string directly into the text area
                    String receipt = String.format(
                        "Base Total:       %.2f php\n" +
                        "Bulk Discount:   -%.2f php\n" +
                        "Premium Disc:    -%.2f php\n" +
                        "Shipping Fee:     %.2f php %s\n" +
                        "---------------------------\n" +
                        "Amount Due:       %.2f php",
                        baseTotal, bulkDiscount, premiumDiscount, shippingFee, shippingLabel, amountDue
                    );
                    
                    receiptArea.setText(receipt);

                } catch (NumberFormatException ex) {
                    receiptArea.setText("Error: Please enter a valid number\nfor the item price.");
                }
            }
        });

        // Make the window visible on screen
        frame.setVisible(true);
    }
}
