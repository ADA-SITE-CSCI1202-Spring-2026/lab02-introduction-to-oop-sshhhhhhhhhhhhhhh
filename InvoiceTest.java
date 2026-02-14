import java.util.Scanner;
import java.util.NoSuchElementException;
class InvoiceTest{
    public static void main(String[] args){
        Invoice invoice = new Invoice("001", "A furniture people use to put something on", 10, 2.75d);
        System.out.println("Product number: " + invoice.getNumber());
        System.out.println("Product description: " + invoice.getDescription());
        System.out.println("Product quantity: " + invoice.getQuantity());
        System.out.println("Product price: " + invoice.getPrice());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
        System.out.println("After discount");
        invoice.setPrice(1.25);
        System.out.println("New price: " + invoice.getPrice());
        System.out.println("New invoice amount: " + invoice.getInvoiceAmount());
    }
}