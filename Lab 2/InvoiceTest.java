// //a2
// public class Invoice 
// {
//     private String partNumber;
//     private String partDescription;
//     private int quantity;
//     private double pricePerItem;

//     // Constructor to initialize the instance variables
//     public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
//         this.partNumber = partNumber;
//         this.partDescription = partDescription;
        
//         // Ensure quantity is positive; if not, set to 0
//         this.quantity = (quantity > 0) ? quantity : 0;
        
//         // Ensure price per item is positive; if not, set to 0.0
//         this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
//     }

//     // Setters and getters for partNumber
//     public String getPartNumber() {
//         return partNumber;
//     }

//     public void setPartNumber(String partNumber) {
//         this.partNumber = partNumber;
//     }

//     // Setters and getters for partDescription
//     public String getPartDescription() {
//         return partDescription;
//     }

//     public void setPartDescription(String partDescription) {
//         this.partDescription = partDescription;
//     }

//     // Setters and getters for quantity
//     public int getQuantity() {
//         return quantity;
//     }

//     public void setQuantity(int quantity) {
//         // If quantity is not positive, set to 0
//         this.quantity = (quantity > 0) ? quantity : 0;
//     }

//     // Setters and getters for pricePerItem
//     public double getPricePerItem() {
//         return pricePerItem;
//     }

//     public void setPricePerItem(double pricePerItem) {
//         // If price is not positive, set to 0.0
//         this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
//     }

//     // Method to calculate and return the invoice amount
//     public double getInvoiceAmount() {
//         return quantity * pricePerItem;
//     }
// }

// public class InvoiceTest {
//     public static void main(String[] args) {
//         // Creating an Invoice object with sample data
//         Invoice invoice1 = new Invoice("A123", "Hammer", 5, 15.99);
        
//         // Displaying invoice details
//         System.out.println("Invoice 1 Details:");
//         System.out.println("Part Number: " + invoice1.getPartNumber());
//         System.out.println("Part Description: " + invoice1.getPartDescription());
//         System.out.println("Quantity: " + invoice1.getQuantity());
//         System.out.println("Price per Item: $" + invoice1.getPricePerItem());
//         System.out.println("Invoice Amount: $" + invoice1.getInvoiceAmount());
        
//         System.out.println();
        
//         // Creating another Invoice object with invalid values for quantity and price
//         Invoice invoice2 = new Invoice("B456", "Screwdriver", -3, -8.5); // Invalid quantity and price
        
//         // Displaying invoice details for the second invoice
//         System.out.println("Invoice 2 Details (with invalid data):");
//         System.out.println("Part Number: " + invoice2.getPartNumber());
//         System.out.println("Part Description: " + invoice2.getPartDescription());
//         System.out.println("Quantity: " + invoice2.getQuantity()); // Should be 0 due to invalid input
//         System.out.println("Price per Item: $" + invoice2.getPricePerItem()); // Should be 0.0
//         System.out.println("Invoice Amount: $" + invoice2.getInvoiceAmount()); // Should be 0.0
        
//         // Modifying values using setters
//         invoice2.setQuantity(3); // Set quantity to a valid positive number
//         invoice2.setPricePerItem(10.0); // Set price to a valid positive value

//         // Displaying updated invoice details
//         System.out.println("\nUpdated Invoice 2 Details:");
//         System.out.println("Quantity: " + invoice2.getQuantity());
//         System.out.println("Price per Item: $" + invoice2.getPricePerItem());
//         System.out.println("Invoice Amount: $" + invoice2.getInvoiceAmount());
//     }
// }
