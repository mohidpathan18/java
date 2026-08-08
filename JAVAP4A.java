package javaapplication5;

import java.util.*;

public class CollectionsAndMathDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- LIST (Numbers) -----");
        List<Double> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextDouble());
        }
        System.out.println("List: " + numbers);
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / numbers.size()));
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));
        System.out.print("Enter number to remove: ");
        double removeNum = input.nextDouble();
        numbers.remove(removeNum);
        System.out.println("Updated List: " + numbers);
        sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.println("New Sum: " + sum);
        System.out.println("New Average: " + (sum / numbers.size()));
        numbers.clear();
        System.out.println("List cleared");
        // ================= SET =================
        System.out.println("\n----- SET (Unique Numbers) -----");

        Set<Integer> set = new HashSet<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            set.add(input.nextInt());
        }
        System.out.println("Set: " + set);

        int sumSet = 0;
        for (int num : set) {
            sumSet += num;
        }
        System.out.println("Sum: " + sumSet);

        Set<Integer> squared = new HashSet<>();
        for (int num : set) {
            squared.add(num * num);
        }

        System.out.println("Squared Set: " + squared);

        System.out.print("Enter number to remove: ");
        int rem = input.nextInt();

        set.remove(rem);
        System.out.println("Updated Set: " + set);


        System.out.println("\n----- MAP (Product Scores) -----");

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter product name: ");
            String name = input.next();

            System.out.print("Enter score: ");
            double score = input.nextDouble();

            map.put(name, score);
        }

        System.out.println("Map: " + map);

        double total = 0;
        for (double val : map.values()) {
            total += val;
        }

        System.out.println("Total Score: " + total);

        System.out.print("Enter product to update: ");
        String update = input.next();

        if (map.containsKey(update)) {
            System.out.print("Enter new score: ");
            double newScore = input.nextDouble();
            map.put(update, newScore);
        }

        System.out.println("Updated Map: " + map);

        total = 0;
        for (double val : map.values()) {
            total += val;
        }

        System.out.println("New Total: " + total);

        System.out.print("Enter product to remove: ");
        String remove = input.next();

        map.remove(remove);
        System.out.println("Final Map: " + map);

        input.close();
    }
}
