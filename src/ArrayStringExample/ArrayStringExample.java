/* 
* Short title 
* J D Eisenberg, 16 Jul 2020 
* Experimenting with ArrayLists 
*  
*/

package src;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

// used to convert an Array to an ArrayList
public class ArrayStringExample {    
    public static void displayList(ArrayList<String> list) {        
        for (int i = 0; i < list.size(); i++) {            
            System.out.printf("%d) %s\n", i, list.get(i));        
            
        }    
    }   

    public static void displayList2(ArrayList<String> list) {        
        for (String item: list) {            
            System.out.println(item);        
            
        }    
        
    }    
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);        
        
        /*         
        * The thing in angle brackets tells what kind of Object         
        * will be in the ArrayList. It *must* be an Object type.         
        * This is called a "generic" (putting a type in < and > )         
        */        

        ArrayList<String> chemList = new ArrayList<>();        
        chemList.add("H2O");        
        chemList.add("NaCl");        
        chemList.add("H2SO4");  

        String[] planetArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};        
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList(planetArray));        
        planetList.add("Saturn");        
        displayList(planetList);        
        System.out.println("Before remove: " + chemList);        
        chemList.remove(1); 

        // removes the item at index #1        

        System.out.println("After remove: " + chemList);        
        chemList.add("H2O2");        
        chemList.add("HCl");        
        chemList.add("C12H22O11"); 

        input.close();    
    }   
}