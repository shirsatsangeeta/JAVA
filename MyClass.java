import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        // Using shortcut class naming
        ArrayList<String> myList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        // Displaying elements of the ArrayList
        System.out.println("Elements of myList:");
        for (String item : myList) {
            System.out.println(item);
        }
    }
}
