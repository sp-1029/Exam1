import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two integers and I will tell you if they add up to 10 or not");
        System.out.println("What is the first integer?");
        int first = scanner.nextInt();
        System.out.println("What is the second integer?");
        int second = scanner.nextInt();
        boolean isTen = makesTen(first, second);
        if (isTen) {
            System.out.println("These numbers add up to 10");
        } else {
            System.out.println("These numbers don't add up to 10");
        }
    }
    public static boolean makesTen(int first, int second) {
        return first + second == 10;
    }
}