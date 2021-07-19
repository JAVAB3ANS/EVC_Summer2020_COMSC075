/*
 * This class describes a custom-made item that has a name,
 * a SKU (stock-keeping unit), price, and surcharge. Methods
 * calculate the total price of an order given a quantity.
 * 
 * J D Eisenberg, 15 Jul 2020
 */

package src;

public class CustomItem extends Item {
  private double surcharge; // as a decimal

  public static void main(String[] args) {
  
  }
  
  public CustomItem() {
    super();
    surcharge = 0.0;
  }
  
  public CustomItem(String name, String sku, double price, double surcharge) {
    super(name, sku, price);
    setSurcharge(surcharge);
  }
  
  @Override
  public double calcOrder(int qty) {
    return super.calcOrder(qty) * (1.0 + surcharge);
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" Surcharge: %.1f%%",
      (100.0 * surcharge));
  }

  public double getSurcharge() {
    return surcharge;
  }
  
  public void setSurcharge(double surcharge) {
    this.surcharge = Math.min(Math.abs(surcharge), 1.0);
  }
}

    
