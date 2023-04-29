import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int res = 0;
        String as = Integer.toString(a);
        for (int i = 0; i < as.length(); i++) {
            char loc = as.charAt(i);
            int loca = Character.getNumericValue(loc);
            res += Math.pow(loca, b);
            b++;
        }
        if (res % a != 0) {
            System.out.println("NO");
            return;
        }
        res /= a;
        if (res == 1 || res == 2 || res == 4 || res == 8 || res == 16 || res == 32 || res == 64) {
            System.out.println("YES");
            System.out.println(a + " * " + res);
        } else {
            System.out.println("NO");
        }
    }
}
