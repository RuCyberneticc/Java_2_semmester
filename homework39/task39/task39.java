import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(getNextGreaterNumber(num));
    }

    public static int getNextGreaterNumber(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;

        int i;
        for (i = n - 2; i >= 0; i--) {
            if (digits[i] < digits[i+1]) {
                break;
            }
        }

        if (i == -1) {
            return -1;
        }

        int j;
        for (j = n - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                break;
            }
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        Arrays.sort(digits, i+1, n);

        int nextNum = Integer.parseInt(String.valueOf(digits));
        return nextNum;
    }
}
