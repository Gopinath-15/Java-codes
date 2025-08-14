import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Map<String, Integer> menu = new HashMap<>();
        menu.put("COFFEE", 15);
        menu.put("TEA", 10);
        menu.put("MILK SHAKE", 50);
        menu.put("JUICE", 25);

        Scanner sc = new Scanner(System.in);
        int net = 0;

        while (true) {
            System.out.println("\tMENU CARD");
            int i = 1;
            
            List<String> items = new ArrayList<>(menu.keySet());
            for (String item : items) 
            {
                System.out.println("\t" + i + ". " + item + " -> Rs." + menu.get(item));
                i++;
            }

            System.out.print("Enter your choice (number): ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > items.size()) {
                System.out.println("Invalid choice");
            
                
            } else 
            {
                String selected = items.get(choice - 1);
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                
                net += qty * menu.get(selected);
            }

            System.out.print("Press 1 to continue or any other key to stop: ");
            if (sc.nextInt() != 1) 
            break;
        }

        System.out.println("\nTotal cost: Rs." + net);
        sc.close();
    }
}
