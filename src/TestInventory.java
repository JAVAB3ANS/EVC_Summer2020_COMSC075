/*
 * Test the Item class and its subclasses 
 * Jason Vu - 7/16/2020
 * Objects and Classes
 * Description: Implement two classes to return  specific data like name, SKU 
 * (stock-keeping unit), price, and quantity about certain inventory items in a store
 */

package src; //please remove this when compiling and testing the code!

class InventoryItem {
  private String itemName ;
  private int sku; // stock-keeping unit
  private double price;
  private int quantity;

  public static void main(String[] args) {
    
  }
  
  public InventoryItem() { //no-argument constructor
    itemName  = "TBD";
    sku = 0;
    price = 0.0;
    quantity = 0;
  }

  public InventoryItem(String itemName , int sku, double price) { //three-argument constructor
    this.itemName  = itemName ;
    this.sku = sku;
    this.price = Math.abs(price);
  }
  
  public InventoryItem(String itemName , int sku, int quantity, double price) { //four-argument constructor
    this.itemName  = itemName ;
    this.sku = sku;
    this.price = Math.abs(price);
    this.quantity = quantity;
  }

  public double getTotalValue(int quantity) { //getTotalValue(int quantity) method
    return quantity * price;
  }
  
  public String display() { //display method
    return String.format("%s [SKU %s]: %s at $%.2f each", itemName, sku, quantity, price);
  }
  
  public String getName() {
    return itemName ;
  }
  
  public void setName(String itemName) {
    this.itemName  = itemName ;
  }
  
  public int getSku() {
    return sku;
  }
  
  public void setSku(int sku) {
    this.sku = sku;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = Math.abs(price);
  }

  /*A static method named compare() which takes as its arguments two InventoryItem objects. This method returns:
-1 if the total value of the first item is less than the total value of the second item
0 if the total value of the first item equals the total value of the second item
1 if the total value of the first item is greater than the total value of the second item*/

/*  public static double compare(int quantity, InventoryItem pencils, InventoryItem staplers) {
    if (pencils.getTotalValue(quantity) > staplers.getTotalValue(quantity)) return 1;
    else if (pencils.getTotalValue(quantity) < staplers.getTotalValue(quantity)) return -1;
    else return 0;
  } */  

  // static variable called nItems, a private integer that tells how many InventoryItem objects have been created.

  /*For example, if item1 has a price of $2.00 and a quantity of 9, and item2 has a price of $3.00 
  and a quantity of 5, compare(item1, item2) would return 1 because the total value of item1 ($18.00) 
  is greater than the total value of item2 ($15.00).*/

  static int nItems = 0; //get amount of InventoryItems objects created;
  {
    nItems += 1; //increments by 1 each time for every item represented
  } 
}

public class TestInventory {

  public static void main(String[] args) {
    InventoryItem emptyItem = new InventoryItem(); //using no-argument constructor
    InventoryItem staplers = new InventoryItem("Stapler, Red", 91745, 7.89); //name, sku, price
    InventoryItem pencils = new InventoryItem("Pencil, #2", 73105, 210, 0.35); //name, sku, quantity, price
    InventoryItem notebooks = new InventoryItem("Notebook, Spiral", 68332, 38, 2.57); //name, sku, quantity, price
    
    double emptyItemTotal = emptyItem.getTotalValue(0); //print no-argument variables
    double staplerTotal = staplers.getTotalValue(0); // order 0 staplers
    double pencilTotal = pencils.getTotalValue(210); //order 210 pencils
    double notebookTotal = notebooks.getTotalValue(38); //order 38 notebooks

    System.out.println("Number of inventory items: " + InventoryItem.nItems); //print total number of objects created 

    System.out.println(); //newline

    //display each of the items and their total values

    System.out.println(emptyItem.display() + //displays name, sku, price
      String.format("\nTotal Value: $%.2f\n", emptyItemTotal)); //displays quantity

    System.out.println(staplers.display() + //displays name, sku, price
      String.format("\nTotal Value: $%.2f\n", staplerTotal)); //displays quantity

    System.out.println(pencils.display() + //displays name, sku, price
      String.format("\nTotal Value: $%.2f\n", pencilTotal)); //displays quantity

    System.out.println(notebooks.display() + //displays name, sku, price
      String.format("\nTotal Value: $%.2f\n", notebookTotal)); //displays quantity

    compare(notebooks, pencils, notebookTotal, pencilTotal);
  }
  public static void compare(InventoryItem notebooks, InventoryItem pencils, double notebookTotal, double pencilTotal) {
    if(notebookTotal < pencilTotal) {
      System.out.println(notebooks.getName() + " has more value than " + pencils.getName());
    }
		else if(notebookTotal > pencilTotal) {
      System.out.println(pencils.getName() + " has less value than " + notebooks.getName());
    }
  }
}