import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);

        int a = h.nextInt();

        int b = h.nextInt();

        long pro = (long) a * b; 

        double sqrt = Math.sqrt(pro); 
        
        if (sqrt == Math.floor(sqrt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        h.close(); 
    }
}
