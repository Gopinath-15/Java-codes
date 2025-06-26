import java.util.Scanner;

class Agent {
    String name;
    int age;
    String codename;
    boolean isUndercover;

    void introduce() {
        System.out.println("Hello, I am Agent " + codename + ".");
        System.out.println("My real name is " + name + ".");
        System.out.println("I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Agent topAgent = new Agent();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        topAgent.name = scanner.nextLine();

        System.out.print("Age: ");
        topAgent.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Codename: ");
        topAgent.codename = scanner.nextLine();

        System.out.print("Undercover? (true/false): ");
        topAgent.isUndercover = scanner.nextBoolean();

        topAgent.introduce();
        scanner.close();
    }
}
