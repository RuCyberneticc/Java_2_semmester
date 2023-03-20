public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(func(n));
    }

    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return func(n / 2);
        }
        if (n % 2 != 0) {
            return func((n - 1) / 2) + func((n - 1) / 2 + 1);
        }
        return 0;
    }

}
