import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер числа Фибоначи: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger res = fibonacci(n);
        String ress = res.toString();
        System.out.println("Число Фибоначчи под номером " + n + " равно " + res);
        Map<Character, Integer> numbers = new HashMap<Character, Integer>();
        for (int i = 0; i < ress.length(); i++) {
            numbers.put(ress.charAt(i), count(ress, ress.charAt(i)));
        }
        Character maxKey = null;
        for (Character key : numbers.keySet()) {
            if (maxKey == null || numbers.get(key) > numbers.get(maxKey)) {
                maxKey = key;
            }
        }
        System.out.print(maxKey + ", " + numbers.get(maxKey));
    }

    public static int count(String s, char c) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res++;
            }
        }
        return res;
    }

    public static BigInteger[][] matrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
        return new BigInteger[][]{
                {a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])), a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))},
                {a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])), a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))},
        };
    }

    public static BigInteger[][] matrixPowerFast(BigInteger[][] a, int n) {
        if (n == 0) {
            return new BigInteger[][]{
                    {BigInteger.ONE, BigInteger.ZERO},
                    {BigInteger.ZERO, BigInteger.ONE}
            };
        } else if (n % 2 == 0) {
            return matrixPowerFast(matrixMultiplication(a, a), n / 2);
        } else {
            return matrixMultiplication(matrixPowerFast(a, n - 1), a);
        }
    }

    public static BigInteger fibonacci(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }

        BigInteger[][] a = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] powerOfA = matrixPowerFast(a, n - 1);
        BigInteger nthFibonacci = powerOfA[0][0];
        return nthFibonacci;
    }
}
