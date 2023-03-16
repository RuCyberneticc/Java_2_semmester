import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int[] m = new int[]{a, b, c};
        Arrays.sort(m);
        a = m[0];
        b = m[1];
        c = m[2];
        if (a + b <= c) {
            System.out.println("Треугольник составить нельзя");
        } else {
            System.out.println("Треугольник составить можно");
            double cs = Math.abs(c * c - a * a - b * b) / (2.0 * a * b);
            double ang = Math.toDegrees(Math.acos(cs));
            System.out.println("Наибольший угол будет примерно " + ang + " градусов");
        }

    }

}
