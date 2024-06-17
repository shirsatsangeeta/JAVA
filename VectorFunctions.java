import java.util.*;
import java.lang.*;
import java.io.*;
public class VectorFunctions {
    public static void main(String[] args) {
        // Create a vector
        Vector<Object> vector = new Vector<>();
        
        // Adding elements to the vector
        vector.addElement("Java");
        vector.addElement("C++");
        vector.addElement("Python");
				System.out.println("");
        System.out.println("Initial Elements in vector are:"+vector);
		System.out.println("");
		
        // Printing the first element of the vector
        System.out.println("Using function firstElement(); \n First Element: " + vector.firstElement());
		System.out.println(" ");
		
        // Printing the last element of the vector
        System.out.println("Using function lastElement(); \n Last Element: " + vector.lastElement());
		System.out.println(" ");
        
        // Adding an item to the end of the vector
		System.out.println("Using function addElement(); \n Adding Element is Ruby. ");
        vector.addElement("Ruby");
		 System.out.println("Vector after adding element is :"+vector);
		System.out.println(" ");
        
        // Getting the element at index 2
        System.out.println("Using function elementAt(); \n Element at index 2: " + vector.elementAt(2));
		System.out.println(" ");
        
        // Getting the size of the vector
        System.out.println("Using function size(); \n Size of vector: " + vector.size());
		System.out.println(" ");
        
        // Setting the size of the vector
        vector.setSize(5);
        System.out.println("Using function setSize(); \n Setting size to 5. \n Size after setting: " + vector.size());
		System.out.println(" ");
        
        // Replacing the element at index 1
		System.out.println("Using function set(); : ");       
		System.out.println("Vector before replacement: " + vector);
		System.out.println("Replacing element at index 1 with C Programing: " + vector);
        vector.set(1, "C Programing");
        System.out.println("Vector after replacement: " + vector);
		System.out.println(" ");
        
        // Getting the current capacity of the vector
		System.out.println("Using function capacity(); : ");
        System.out.println("Capacity of vector: " + vector.capacity());
		System.out.println(" ");
        
        // Checking if an element exists in the vector
        System.out.println("Using function contains(); \n Contains Java? " + vector.contains("Java"));
		System.out.println(" ");
        
        // Clearing the vector
		System.out.println("Using function clear(); : " + vector);
   		System.out.println("Vector before clearing: " + vector);
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
		System.out.println(" ");
        
        // Adding elements again
		System.out.println("Adding Some elements in vector using function addElement(); : ");
        vector.addElement("Python");
        vector.addElement("Java");
        vector.addElement("C++");
		vector.addElement("Ruby");
        System.out.println("Vector after adding elements : " + vector);
		System.out.println(" ");
		
        // Removing an element
		System.out.println("Using function remove('element'); : ");
        vector.remove("Python");
        System.out.println("Vector after removing 'Python' : " + vector);
		System.out.println(" ");
        
        // Removing an element at index
		System.out.println("Using function remove('index'); : ");
        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);
		System.out.println(" ");
        
        // Removing element at index 0
		System.out.println("Using function removeElementAt(); : ");
        vector.removeElementAt(0);
        System.out.println("Vector after removing element at index 0: " + vector);
		System.out.println(" ");
        
        // Removing all elements
		System.out.println("Using function removeAllElements(); : ");
        vector.removeAllElements();
        System.out.println("Vector after removing all elements: " + vector);
		System.out.println(" ");
        
        // Adding elements again
		System.out.println("Adding Some elements in vector using function addElement(); : ");
        vector.addElement("React.js");
        vector.addElement("Node.js");
        vector.addElement("JavaScript");
        System.out.println("Vector after adding elements : " + vector);
		System.out.println(" ");
		
        // Copying elements to an array
		System.out.println("Using function copyInto(); : ");
		System.out.println("coping Elements into the an Array of vector size.(using function (vector.size();)) : ");
        Object[] array = new Object[vector.size()];
        vector.copyInto(array);
        System.out.println("Array after copying elements from vector: " + Arrays.toString(array));
		System.out.println(" ");
        
        // Inserting an element at index 1
		System.out.println("Using function insertElementAt(); : ");
        vector.insertElementAt("PHP", 1);
        System.out.println("Vector after inserting PHP at index 1: " + vector);
		System.out.println(" ");
        
        // Checking if an element exists in the vector
		System.out.println("Using function contains(); : ");
        System.out.println("Contains PHP? " + vector.contains("PHP"));
		System.out.println(" ");
        
        // Getting an enumeration of elements
		System.out.println("Using function hasMoreElements(); and nextElement(); : ");
        Enumeration<Object> enumeration = vector.elements();
        System.out.println("Elements using enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
		System.out.println(" ");
        
        // Getting the index of an element
		System.out.println("Using function indexOf(); : ");
        System.out.println("Index of JavaScript: " + vector.indexOf("JavaScript"));
		System.out.println(" ");
        
        // Getting the last index of an element
		System.out.println("Using function lastIndexOf(); : ");
        System.out.println("Last index of PHP: " + vector.lastIndexOf("PHP"));

    }
}