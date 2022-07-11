/*
 * Test the Item class and its subclasses 
 * J D Eisenberg, 15 Jul 2020 
 */

package src;

public class TestItems {

  public static void main(String[] args) {
    Item regular = new Item("Pencil", "P0345", 0.15); //name, sku, price
    SaleItem cheap = new SaleItem("Shirt", "S110-X", 5.98, 0.05); //name, sku, price, discount
    CustomItem luxury = new CustomItem("Perfume", "P77-22-Z", 138.0, 0.15); //name, sku, price, discount
    
    double regularTotal = regular.calcOrder(10); // order 10 pencils
    double cheapTotal = cheap.calcOrder(5); // five shirts
    double luxuryTotal = luxury.calcOrder(1); // one bottle of perfume
    
    System.out.println(regular.toString() +
      String.format(" Subtotal: $%.2f", regularTotal));
    System.out.println(cheap.toString() +
      String.format(" Subtotal: $%.2f", cheapTotal));
    System.out.println(luxury.toString() +
      String.format(" Subtotal: $%.2f", luxuryTotal));
  }
  
}
