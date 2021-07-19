package src;

//import java.util.Date;

public class FinalTest {
	/*public static void main(String[] args) {
		Currency norge = new Currency("Norway", "kronor", 1.20);
		reduceExchangeRate(norge);
		System.out.println(norge.getDollarExchange());
	}
	
	public static void reduceExchangeRate(Currency c) {
		c = new Currency(c.getCountry(), c.getName(),
			c.getDollarExchange());
	}*/
	
	/*public static void main(String[] args) {
		try {
			System.out.println("Welcome to Java."); //First output
			return;
		} finally {
			System.out.println("The finally clause is executed."); //second output
		}
	}*/
	
	/*public static void main(String[] args) {
		try {
			System.out.println("Welcome to Java")
		}
	}*/ //error: 'try' without 'catch', 'finally', or resource declarations
	
	/*public static void main(String[] args) {
		try {
			String s = "5.6";
			Integer.parseInt(s); //cause a NumberFormatException
			
			int i = 0;
			int y = 2 / i;
			System.out.println("Welcome to Java");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}*/ //The program has a compile error - NumberFormatException
	
	/*public static void main(String[] ARGS) {
		Object o = new Object();
		String d = (String)o;
	}*/ //returns ClassCastException
	
	/*public static void main(String[] args) {
		new Person().printPerson(); //output 1 is Person
		new Student().printPerson(); //output 2 is Student
	}*/
	
	/*Cylinder cy = new Cylinder(1,1);
	Circle c = cy; //cannot find symbol Circle and Cylinder */
	
	/*public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person()); //m(new Person()) causes an error
		m(new Object()); //m(new Object()) causes an error
	}
	
	public static void m(Student x) {
		System.out.println(x.toString());
	}*/
	
	/*public static void main(String[] args) {
		B b = new B();
		//first output line: Constructor for A
		//second output line: Constructor for B
	}*/
	
	
	/*public static void main(String[] args) {
		String[] tokens = "Welcome to Java".split("o");
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + "/");
		} //Output: Welc/me t/Java/
	}*/
	
	/*public static void main(String[] args) {
		String s1 = new String("Welcome to Java!");
		String s2 = new String("Welcome to Java!");
		
		if(s1 == s2) {
			System.out.println("s1 and s2 reference to the same String object.");
		} else {
			System.out.println("s1 and s2 reference to different String objects."); //the output
		}
	}*/
	
	/*private int id;
	
	public void m1() {
		this.id = 45; //"This" can be placed in the blank line in the following code
	}*/
	
	/*static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {
		int i = 2;
		int k = 3;
		{
			int j = 3;
			System.out.println("i + j is " + (i + j)); //first output is 5
		}
		k = i + j;
		System.out.println("k is " + k); //second output 2
		System.out.println("j is " + j); //third output is 0
	}*/
		
	/*public static void main(String[] args) {
		int[][] x = {{1,2}, {3,4,5,6}, {7,8,9}};
		System.out.println(x[0].length); //length is 2
		System.out.println(x[1].length); //length is 4
		System.out.println(x[2].length); //length is 3
	}*/
	
	/*public static void main(String[] args) {
		boolean[][] x = new boolean[3][];
		x[0] = new boolean[1];
		x[1] = new boolean[2];
		x[2] = new boolean[3];
		System.out.println("x[2][2] is " + x[2][2]);
	}*/
	
	/*public static void main(String[] args) {
		int n= 2;
		xMethod(n);
		
		System.out.println("n is " + n);
		
	}
	
	public static void xMethod(int n) {
		n++; //needs public static before void xMethod (int n)
	}*/
	
	/*public static void main(String[] args) {
		int[][] matrix = 
		{{1,2,3,4},
		{4,5,6,7},
		{8, 9, 10, 11},
		{12, 13, 14, 15}};
	
	for(int i = 0; i < 4; i++) 
		System.out.print(matrix[i][1] + " ");
	}*/ // Prints out 2, 5, 9, 13
	
	/*public static void main(String[] args) {
		A a = new A();
		a.print();
	}*/ 
	//The program has a compile error because class A doesn't
	// have a default constructor. The program would compile and
	// run if you change A a = new A() to A a = new A("5").
	
	/*public static void main(String[] args) {
		NClass nc = new NClass();
		nc.t = nc.t++;
	}*/ //The code doesn't compile properly because the class
	
	/*private int t;
	    
	public static void main(String[] args) {
		int x;
		System.out.println(t);
	}*/ //Error: non-static variable t cannot be referenced from a static context
	
	/*public static void main(String[] args) {
		Date date = new Date(1234567);
		m1(date);
		System.out.println(date.getTime());
		
		m2(date);
		System.out.println(date.getTime());
		
		//First println: 1234567
		//Second println: 7654321
	}
	
	public static void m1(Date date) {
		date = new Date(7654321);
	}
	
	public static void m2(Date date) {
		date.setTime(7654321);
	}*/
}
/*
class A {
	private String s;
	
	
	A() {
		String s = "";
	}
	
	A(String s) {
		this.s = s;
	}
	
	void print() {
		System.out.println(s);
	}
} */

/*class NClass {
	int t;
	private NClass() {
	}
}  */
/*
class A {
	public A() {
		System.out.println("Constructor for A");
	}
}*/
/*
class B extends A {
	public B() {
		System.out.println("Constructor for B");
	}
}*/

/*
class GraduateStudent extends Student {
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}*/

/*class Student extends Person {
	@Override
	public String getInfo() {
		return "Student";
	}
}

class Person {
	public String getInfo() {
		return "Person";
	}
	
	public void printPerson() {
		System.out.println(getInfo());
	}
}*/
/*
class Currency {
	private String country;
	private String name;
	private double dollarExchange;
	
	public Currency(String country, String name, double dollarExchange) {
		this.country = country;
		this.name = name;
		this.dollarExchange = dollarExchange;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public double getDollarExchange() {
		return dollarExchange * 0.8;
	}
	
	public void setDollarExchange(double dollarExchange) {
		this.dollarExchange = dollarExchange;
	}
}*/
