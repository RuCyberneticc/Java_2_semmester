import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Не простое");
                return;
            }
        }
        System.out.println("Простое");
    }

}
