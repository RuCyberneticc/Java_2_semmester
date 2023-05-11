import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] arabicValues = {1, 5, 10, 50, 100, 500, 1000};
        char[] romanValues = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество лет в римских числах:");
        String romanYears = scanner.nextLine();

        int arabicYears = 0;
        for (int i = 0; i < romanYears.length(); i++) {
            int currentRomanValue = getValue(romanYears.charAt(i), romanValues, arabicValues);
            int nextRomanValue = 0;
            if (i < romanYears.length() - 1) {
                nextRomanValue = getValue(romanYears.charAt(i + 1), romanValues, arabicValues);
            }
            if (currentRomanValue < nextRomanValue) {
                arabicYears -= currentRomanValue;
            } else {
                arabicYears += currentRomanValue;
            }
        }

        System.out.println("Количество лет в арабских числах: " + arabicYears);
    }

    public static int getValue(char romanValue, char[] romanValues, int[] arabicValues) {
        for (int i = 0; i < romanValues.length; i++) {
            if (romanValues[i] == romanValue) {
                return arabicValues[i];
            }
        }
        return 0;
    }
}
