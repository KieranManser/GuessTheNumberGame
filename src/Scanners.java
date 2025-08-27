import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        //scanner declared
        Scanner scanner = new Scanner(System.in);
        //scanner reads user text input
        System.out.println("Input Text here: ");
        String message = scanner.nextLine();
        System.out.println("Your string was: " + message);
        //scanner reads user number input
        System.out.println("Write a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Your integer is: " + value);
        //scanner reads user decimal input
        System.out.println("Write a decimal value: ");
        double decimalValue = Double.valueOf(scanner.nextLine());
        System.out.println("Your decimal is: " + decimalValue);
        //scanner reads user boolean input
        System.out.println("Is this true or false?: ");
        boolean booleanValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("This is " + booleanValue);
    }
}