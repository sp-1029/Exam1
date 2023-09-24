import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number for a beverage: 1 for water, 2 for coke, and 3 for coffee");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("You chose water");
        } else if (choice == 2) {
            System.out.println("You chose coke");
        } else if (choice == 3) {
            System.out.println("You chose coffee");
        } else {
            System.out.println("invalid choice");
        }
    }
}
