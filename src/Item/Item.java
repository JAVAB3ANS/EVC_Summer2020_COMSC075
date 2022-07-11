/*
 * This class describes an item that has a name,
 * a SKU (stock-keeping unit) and price. Methods
 * calculate the total price of an order given a quantity.
 * 
 * J D Eisenberg, 15 Jul 2020
 */

package src;

public class Item extends TestItems{
  private String name;
  private String sku; // stock-keeping unit
  private double price;

  public static void main(String[] args) {
  
  }
  
  public Item() {
    name = "";
    sku = "";
    price = 0.0;
  }
  
  public Item(String name, String sku, double price) {
    this.name = name;
    this.sku = sku;
    this.price = Math.abs(price);
  }
  
  public double calcOrder(int qty) {
    return qty * price;
  }
  
  @Override
  public String toString() {
    return String.format("%s (%s) $%.2f", name, sku, price);
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getSku() {
    return sku;
  }
  
  public void setSku(String sku) {
    this.sku = sku;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = Math.abs(price);
  }
}