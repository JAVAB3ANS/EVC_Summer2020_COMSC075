/* Pretty novice project here. Trying to make a car class that you can 
set the maker, color, year, and price of the car. In the TestCar class, 
you can compare the "value" of the car */

package src;

class Car {
	private String maker;
	private String color;
	private int year;
    private double price;
    
	//No-Argument Constructor
	public Car() { 
		maker = "TBD";
		color = "Null";
		year = 0;
		price = 0;
	}
	
        //Constructor
	public Car(String maker, String color, int year, double price) {
		this.maker = maker;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
        //Displays variables of a car in a String
	public String display() {
		return String.format("The car is a %s, %s %s that is priced at $%.2f", color, year, maker, price);
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}

public class TestCar {

	public static void main(String[] args) {
		Car num1 = new Car("Honda", "Grey", 2013, 4000.00);
		Car num2 = new Car("Ford", "Blue", 2006, 4199.99);
		Car num3 = new Car("Ferari", "Black", 2020, 600000.00);
		System.out.println(num1.display());
		System.out.println(num2.display());  
		System.out.println(num3.display());  
		compare(num1, num2);   
		compare(num1, num3);   
		compare(num2, num3);  
	}
	
	public static void compare(Car item1, Car item2) {
		if(item1.getYear() > item2.getYear() && item1.getPrice() < item2.getPrice()) {
			System.out.println("You should buy " + item1.getMaker());
		}
		else if (item1.getYear() < item2.getYear() && item1.getPrice() > item2.getPrice()) {
			System.out.println("You should buy " + item2.getMaker());
		} else {
		    System.out.println("Both cars have similar value");
		}
	}
}