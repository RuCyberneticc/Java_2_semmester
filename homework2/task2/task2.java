import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите общее количество вошедших: ");
        int num = input.nextInt();
        int res = 0;
        System.out.print("Введите в строчку значение для каждого вошедшего: ");
        for (int i = 0; i < num; i++) {
            int cons = input.nextInt();
            if (cons == 1) {
                res++;
            }
        }

        System.out.println("Количество вошедших сотрудников: " + res);
    }
}
