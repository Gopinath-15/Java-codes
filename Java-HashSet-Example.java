import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        
        // Adding elements (HashSet does not allow duplicates)
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Bugatti");
        cars.add("BMW"); // duplicate, will be ignored
        cars.add("Volvo");
        
        System.out.println("HashSet: " + cars);
        
        // Size before removing
        System.out.println("Size before removing: " + cars.size());
        
        // Removing an element
        cars.remove("Audi");
        System.out.println("After removing Audi: " + cars);
        
        // Checking if an element exists
        System.out.println("Contains Bugatti? " + cars.contains("Bugatti"));
        
        // Size after removing
        System.out.println("Size after removing: " + cars.size());
        
        // Iterating through the HashSet
        System.out.println("Iterating:");
        for (String car : cars) {
            System.out.println(car);
        }
        
        // Clearing the HashSet
        cars.clear();
        System.out.println("After clear: " + cars);
    }
}
