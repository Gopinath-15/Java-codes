import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
        int sum=0;
        Scanner h = new Scanner(System.in);
        
        System.out.print("Enter the size of an array: ");
        int n=h.nextInt();
        
        int[] g = new int[n];
        
        for (int i = 0; i < n; i++) 
        {     
            g[i] = h.nextInt();
        }
        
        for (int i = 0; i < n; i++) 
        
        {       
            sum=sum+g[i];
        }
        
        System.out.println("Total= "+sum);
        
    }
}
