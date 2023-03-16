import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int start = Math.min(a, b);
        int step = Math.min(a, b);
        int n = Math.max(a, b);
        for (int i = 0; i < n; i++) {
            System.out.print(start * start + " ");
            start += step;
        }
    }

}
