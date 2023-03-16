import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int step = input.nextInt();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += step;
        }
    }

}
