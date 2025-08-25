import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Text here: ");
        String message = scanner.nextLine();
        System.out.println("Your message was; " + message);
    }
}