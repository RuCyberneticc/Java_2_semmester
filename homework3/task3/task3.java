import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите по очереди координаты X и Y для каждой вершины: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        double x = (x1 + x2 + x3) / 3.0;
        double y = (y1 + y2 + y3) / 3.0;

        System.out.println("Координаты барицентра: " + x + " " + y);
    }
}
