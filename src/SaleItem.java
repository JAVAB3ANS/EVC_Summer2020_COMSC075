/*
 * This class describes a sales-priced item that has a name,
 * a SKU (stock-keeping unit), price, and discount. Methods
 * calculate the total price of an order given a quantity.
 * 
 * J D Eisenberg, 15 Jul 2020
 */

 package src;

public class SaleItem extends Item {
  private double discount; // as a decimal

  public static void main(String[] args) {
  
  }
  
  public SaleItem() {
    super();
    discount = 0.0;
  }
  
  public SaleItem(String name, String sku, double price, double discount) { //name, sku, price, discount
    super(name, sku, price);
    setDiscount(discount);
  }
  
  @Override
  public double calcOrder(int qty) {
    return super.calcOrder(qty) * (1.0 - discount);
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" Discount: %.1f%%",
      (100.0 * discount));
  }
  
  public double getDiscount() {
    return discount;
  }
  
  /* Make sure that 0 <= discount <= 1.0; makes negative
   * discounts positive */
  public void setDiscount(double discount) {
    this.discount = Math.min(Math.abs(discount), 1.0);
  }
}

    
