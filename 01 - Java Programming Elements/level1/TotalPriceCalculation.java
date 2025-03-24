import java.util.Scanner;
public class TotalPriceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();        
        double totalPrice = unitPrice * quantity;        
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);        
        sc.close();
    }
}
