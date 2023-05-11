import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();
        String roman = toRoman(years);
        System.out.println(years + " лет = " + roman);
    }
    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_NUMERALS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            while (number >= ARABIC_NUMERALS[i]) {
                result.append(ROMAN_NUMERALS[i]);
                number -= ARABIC_NUMERALS[i];
            }
        }
        return result.toString();
    }
}
