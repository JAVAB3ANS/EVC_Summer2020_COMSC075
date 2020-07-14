package src;

public class Example3 {
    public static void main(String[] args) {
		String noun="clothespin";
		char ch1[]=new char[5]; //extracts the word "the" from the noun
		noun.getChars(3,6,ch1,0);
		System.out.println(ch1);
		
		char ch2[]=new char[9]; //extract the word "spin from the noun
		noun.getChars(6,10,ch2,0);
		System.out.println(ch2);
		
		String verb=new String("referred"); // find index of first "e" in the verb
		int index1=verb.indexOf("e");
		System.out.println("Location of the first letter \"e\" in the verb: " + index1);
		
		int index2=verb.indexOf("re", 4); // find index of last "re" in the verb
		System.out.println("Location of the last occurence of \"re\" in the verb: " + index2);
	}
}
