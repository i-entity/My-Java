// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// *************************************************************** 
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Scanner; 

public class Shop{
    
    public static void main (String[] args)
   { 
        Item item;
        String itemName;
        double itemPrice; 
        int quantity;
        double totalPrice = 0;
        int index = 0;
        ArrayList<Item> cart = new ArrayList<Item>();
                
        Scanner scan = new Scanner(System.in); 
        
        String keepShopping = "y"; 
        
        do
           { 
                System.out.println("Enter the name of the item: ");
                itemName = scan.next(); 
                System.out.println("Enter the unit price: "); 
                itemPrice = scan.nextDouble();
                System.out.println("Enter the quantity: "); 
                quantity = scan.nextInt();
                
                // *** create a new item and add it to the cart 
                item = new Item(itemName, itemPrice, quantity);
                cart.add(item);
                                                        
                // *** print the contents of the cart object 
                System.out.println(item.toString());
                System.out.println(cart.get(index));
                System.out.println("Continue shopping (y/n)? ");
                keepShopping = scan.next();
                totalPrice += item.getQuantity() * item.getPrice();
           }
        while (keepShopping.equalsIgnoreCase("y"));
        while (index < cart.size())
        {
            System.out.println(cart.get(index));
            index++;
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Your total comes to: " 
                    + fmt.format(totalPrice));
        
        scan.close();
        
   }
}