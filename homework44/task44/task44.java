import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Введите второе число: ");
        String secondNumber = scanner.nextLine();
        int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        System.out.println("Сумма: " + sum);
    }
}
