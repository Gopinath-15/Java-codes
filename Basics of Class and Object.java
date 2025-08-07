import java.util.Scanner;


class Vehicle {
    String brand;
    int speed;

   
    void show() {
        System.out.println("Car brand: " + brand);
        System.out.println("Top speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v1 = new Vehicle();

        System.out.print("Enter a car brand name: ");
        v1.brand = sc.nextLine();

        System.out.print("Enter the top speed (km/h): ");
        v1.speed = sc.nextInt();

        sc.nextLine(); 

        System.out.println("\nVehicle Information:");
        v1.show();

       
        sc.close();
    }
}
