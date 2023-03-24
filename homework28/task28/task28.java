import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("Данное число не может быть разностью двух последовательных квадратов");
        } else {
            int kn = (n - 3) / 2 + 1;
            int a = kn * kn;
            int b = (kn + 1) * (kn + 1);
            System.out.println(n + " = " + b + " - " + a);

        }


    }
}
