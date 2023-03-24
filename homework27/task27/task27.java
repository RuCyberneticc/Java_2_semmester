import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку для шифрования: ");
        String str = input.nextLine();
        System.out.print("Введите число сдвига: ");
        int n = input.nextInt();
        System.out.print("Введите направление (0 - влево, 1 - вправо): ");
        int k = input.nextInt();
        int c;
        int d;
        String next = "";
        if (k == 1) {
            for (int i = 0; i < str.length(); i++) {
                c = (str.charAt(i) + n);
                d = (c - 1072) % 32 + 1072; // 1040 - это код буквы А, 32 - это кол-во букв
                next += (char) d; // получаем букву по коду
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                c = (str.charAt(i) - n);
                d = (c - 1072) % 32 + 1072; // 1040 - это код буквы А, 32 - это кол-во букв
                next += (char) d; // получаем букву по коду
            }
        }
        System.out.println(next);


    }
}
