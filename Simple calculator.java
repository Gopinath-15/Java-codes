import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /, %): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter two numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    int intNum1 = (int) num1;
                    int intNum2 = (int) num2;
                    int modResult = intNum1 % intNum2;
                    System.out.println(intNum1 + " % " + intNum2 + " = " + modResult);
                } else {
                    System.out.println("Error! Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
