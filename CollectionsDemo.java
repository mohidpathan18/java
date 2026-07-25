package javaapplication5;
import java.util.*;
public class CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("----- LIST INTERFACE -----");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate allowed
        System.out.println("Initial List: " + fruits);
        fruits.add(1, "Grape");
        System.out.println("After adding Grape: " + fruits);
        System.out.println("First element: " + fruits.get(0));
        fruits.set(2, "Mango");
        System.out.println("After update: " + fruits);
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);
        fruits.remove(fruits.size() - 1);
        System.out.println("After removing last element: " + fruits);
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        System.out.println("Size: " + fruits.size());
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("\n----- SET INTERFACE -----");
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // duplicate ignored
        System.out.println("Initial Set: " + colors);
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
        System.out.println("Contains Blue? " + colors.contains("Blue"));
        System.out.println("Size: " + colors.size());
        System.out.println("Is Empty? " + colors.isEmpty());
        System.out.print("Iterating: ");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Yellow");
        moreColors.add("Blue");
        colors.addAll(moreColors);
        System.out.println("After addAll: " + colors);
        System.out.println("\n----- MAP INTERFACE -----");
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 95);
        studentMarks.put("Bob", 88);
        studentMarks.put("Charlie", 76);
        studentMarks.put("Alice", 98); 
        System.out.println("Initial Map: " + studentMarks);
        System.out.println("Bob's Marks: " + studentMarks.get("Bob"));
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);
        System.out.println("Contains key Bob? " + studentMarks.containsKey("Bob"));
        System.out.println("Contains value 98? " + studentMarks.containsValue(98));
        System.out.println("Keys: " + studentMarks.keySet());
        System.out.println("Values: " + studentMarks.values());
        System.out.println("Entries: " + studentMarks.entrySet());
        System.out.println("Size: " + studentMarks.size());
        studentMarks.clear();
        System.out.println("After clearing: " + studentMarks);
    }
}