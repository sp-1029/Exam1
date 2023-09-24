import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        int i = 0;
        double sum = 0;
        double add;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Keep giving me numbers and I will add up the sum, once you enter 0 I will give you the final sum");
        while(i == 0) {
            add = scanner.nextDouble();
            if (add == 0) {
                System.out.println("Your final number is " + sum);
                i = 1;
            } else {
                sum = sum + add;
                System.out.println("Your new sum is " + sum + ", please add another number");
            }
        }
    }
}
