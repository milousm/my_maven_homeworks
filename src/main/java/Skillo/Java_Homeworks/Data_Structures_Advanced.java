package Skillo.Java_Homeworks;

import java.util.HashMap;
import java.util.HashSet;

public class Data_Structures_Advanced {

    public static void main(String[] args) {
        storeInventory();
        partyGuests();

    }

    public static void storeInventory() {

        HashMap<String, Integer> inventory = new HashMap<>();

        //Add several products to the inventory with their quantities
        inventory.put("Apple", 10);
        inventory.put("Banana", 10);
        inventory.put("Peach", 6);
        inventory.put("Pear", 13);
        inventory.put("Grapes", 19);

        System.out.println("Store inventory consists of:" + inventory);


        //Check the quantity of a specific productToCheck.


        String productToCheck = "Peach";

        if (inventory.containsKey(productToCheck)) {
            System.out.println("Quantity of : " + productToCheck + ": " + inventory.get(productToCheck));
        } else {
            System.out.println(productToCheck + " is not in the inventory.");
        }

        System.out.println("Updated store inventory: " + inventory);


        //Restock a product by increasing its quantity.

        String productToRestock = "Banana";
        Integer productQuantity = 20;

        inventory.put(productToRestock, productQuantity);

        System.out.println("The quantity of" + productToRestock + " is :" + productQuantity);

        System.out.println("Updated store inventory: " + inventory);

        //Mark a product as out of stock by setting its quantity to zero.

        String outOfStockProduct = "Pear";

        inventory.put(outOfStockProduct, null);

        System.out.println("The product " + outOfStockProduct + " is out of stock");

        System.out.println("Updated store inventory: " + inventory);


        //Remove a product from the inventory

        String removedProduct = "Grapes";

        inventory.remove(removedProduct);

        System.out.println("The product " + removedProduct + " Has been removed from inventory");

        System.out.println("Updated store inventory: " + inventory);

        //Print the entire inventory to see the stock levels.


        System.out.println("Entire inventory: ");
        System.out.println(inventory);
    }

    public static void partyGuests(){

//Add several guest names to the list.

        HashSet<String> guestList = new HashSet<>();
        guestList.add("John Doe");
        guestList.add("John Wick");
        guestList.add("John Lennon");
        guestList.add("John Travolta");

        System.out.println("Guest list: " + guestList);

//Attempt to add a duplicate name and observe that it doesn’t get added again.

        String repeatedName = "John Travolta";
        guestList.add(repeatedName);

        System.out.println("Guest list with added a repeated name: " + repeatedName + " : " + guestList);

//Remove a guest who can’t attend the party.

        String removedName = "John Doe";
        guestList.remove(removedName);

        System.out.println("Guest list with added removed name: " + removedName + " : " + guestList);

//Check if a specific person is on the guest list.

        String checkedName = "John Wick";
        boolean present = guestList.contains(checkedName);

        if (present){
            System.out.println("Name is present in the guest list");
        }else{
            System.out.println("Name is NOT present in the guest list");
        }

//Print all the guest names to see who is attending.

        System.out.println("Full guest list :" + guestList);

    }
}
